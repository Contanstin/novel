package io.github.xxyopen.novel.core.listener;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.elasticsearch.core.IndexResponse;
import io.github.xxyopen.novel.core.constant.AmqpConsts;
import io.github.xxyopen.novel.dao.entity.BookInfo;
import io.github.xxyopen.novel.dao.mapper.BookInfoMapper;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

/**
 * @author :Contanstin
 * @create 2022/8/9 0:52
 */
@Component
@ConditionalOnProperty(prefix = "spring", name = {"elasticsearch.enable",
        "amqp.enable"}, havingValue = "true")
@RequiredArgsConstructor
@Slf4j
public class RabbitQueueListener {
    private final BookInfoMapper bookInfoMapper;

    private final ElasticsearchClient esClient;


    /**
     * 监听redis缓存更新
     */
    @RabbitListener(queues = AmqpConsts.BookChangeMq.QUEUE_REDIS_UPDATE)
    @SneakyThrows
    public void updateRedis(Long bookId){
        BookInfo bookInfo = bookInfoMapper.selectById(bookId);
        log.info("更新了Redis " + bookInfo.getBookName() + " 章节");

    }


    //    /**
//     * 监听小说信息改变的 ES 更新队列，更新最新小说信息到 ES
//     */
//    @RabbitListener(queues = AmqpConsts.BookChangeMq.QUEUE_ES_UPDATE)
//    @SneakyThrows
//    public void updateEsBook(Long bookId) {
//        BookInfo bookInfo = bookInfoMapper.selectById(bookId);
//        IndexResponse response = esClient.index(i -> i
//                .index(EsConsts.BookIndex.INDEX_NAME)
//                .id(bookInfo.getId().toString())
//                .document(EsBookDto.build(bookInfo))
//        );
//        log.info("Indexed with version " + response.version());
//    }
}
