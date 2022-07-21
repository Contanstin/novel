package io.github.xxyopen.novel.controller.front;

import io.github.xxyopen.novel.core.common.constant.ApiRouterConsts;
import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.BookRankRespDto;
import io.github.xxyopen.novel.service.BookService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 前台门户-小说模块 API 控制器
 *
 * @author :Contanstin
 * @create 2022/7/21 0:13
 */
@Tag(name = "BookController", description = "前台门户-小说模块")
@RestController
@RequestMapping(ApiRouterConsts.API_FRONT_BOOK_URL_PREFIX)
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    /**
     * 小说点击榜查询接口
     */
    @Operation(summary = "小说点击榜查询接口")
    @GetMapping("visit_rank")
    public RestResp<List<BookRankRespDto>> listVisitRankBooks() {
        return bookService.listVisitRankBooks();
    }

    /**
     * 小说新书榜查询接口
     */
    @Operation(summary = "小说新书榜查询接口")
    @GetMapping("newest_rank")
    public RestResp<List<BookRankRespDto>> listNewestRankBooks() {
        return bookService.listNewestRankBooks();
    }

    /**
     * 小说更新榜查询接口
     */
    @Operation(summary = "小说更新榜查询接口")
    @GetMapping("update_rank")
    public RestResp<List<BookRankRespDto>> listUpdateRankBooks() {
        return bookService.listUpdateRankBooks();
    }
}
