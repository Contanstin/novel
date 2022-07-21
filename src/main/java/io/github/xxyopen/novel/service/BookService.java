package io.github.xxyopen.novel.service;

import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.BookRankRespDto;

import java.util.List;

/**
 * 小说模块 服务类
 *
 * @author :Contanstin
 * @create 2022/7/21 0:06
 */
public interface BookService {

    /**
     * 小说点击榜查询
     *
     * @return 小说点击排行列表
     */
    RestResp<List<BookRankRespDto>> listVisitRankBooks();

    /**
     * 小说新书榜查询
     *
     * @return 小说新书排行列表
     */
    RestResp<List<BookRankRespDto>> listNewestRankBooks();

    /**
     * 小说更新榜查询
     *
     * @return 小说更新排行列表
     */
    RestResp<List<BookRankRespDto>> listUpdateRankBooks();
}
