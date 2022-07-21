package io.github.xxyopen.novel.controller.front;

import io.github.xxyopen.novel.core.common.constant.ApiRouterConsts;
import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.NewsInfoRespDto;
import io.github.xxyopen.novel.service.NewsService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 前台门户-新闻模块 API 控制器
 *
 * @author :Contanstin
 * @create 2022/7/20 23:54
 */
@Tag(name = "NewsController", description = "前台门户-新闻模块")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_NEWS_URL_PREFIX)
@RequiredArgsConstructor
public class NewsController {

    private final NewsService newsService;

    /**
     * 最新新闻列表查询接口
     */
    @Operation(summary = "最新新闻列表查询接口")
    @GetMapping("latest_list")
    public RestResp<List<NewsInfoRespDto>> listLatestNews() {
        return newsService.listLatestNews();
    }
}
