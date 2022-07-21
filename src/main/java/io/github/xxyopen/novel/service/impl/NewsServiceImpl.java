package io.github.xxyopen.novel.service.impl;

import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.NewsInfoRespDto;
import io.github.xxyopen.novel.manager.cache.NewsCacheManager;
import io.github.xxyopen.novel.service.NewsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 新闻模块 服务实现类
 *
 * @author :Contanstin
 * @create 2022/7/20 23:58
 */
@Service
@RequiredArgsConstructor
public class NewsServiceImpl implements NewsService {

    private final NewsCacheManager newsCacheManager;
    @Override
    public RestResp<List<NewsInfoRespDto>> listLatestNews() {
        return RestResp.ok(newsCacheManager.listLatestNews());
    }
}
