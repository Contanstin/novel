package io.github.xxyopen.novel.service;

import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.BookRankRespDto;
import io.github.xxyopen.novel.manager.cache.BookRankCacheManager;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 小说模块 服务实现类
 *
 * @author :Contanstin
 * @create 2022/7/21 0:09
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class BookServiceImpl implements BookService{

    private final BookRankCacheManager bookRankCacheManager;

    @Override
    public RestResp<List<BookRankRespDto>> listVisitRankBooks() {
        return RestResp.ok(bookRankCacheManager.listVisitRankBooks());
    }

    @Override
    public RestResp<List<BookRankRespDto>> listNewestRankBooks() {
        return RestResp.ok(bookRankCacheManager.listNewestRankBooks());
    }

    @Override
    public RestResp<List<BookRankRespDto>> listUpdateRankBooks() {
        return RestResp.ok(bookRankCacheManager.listUpdateRankBooks());
    }
}
