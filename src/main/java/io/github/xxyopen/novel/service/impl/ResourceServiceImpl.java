package io.github.xxyopen.novel.service.impl;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.ImgVerifyCodeRespDto;
import io.github.xxyopen.novel.manager.redis.VerifyCodeManager;
import io.github.xxyopen.novel.service.ResourceService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * 资源（图片/视频/文档）相关服务实现类
 *
 * @author :Contanstin
 * @create 2022/7/18 21:55
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class ResourceServiceImpl implements ResourceService {

    private final VerifyCodeManager verifyCodeManager;

    @Override
    public RestResp<ImgVerifyCodeRespDto> getImgVerifyCode() throws IOException {
        String sessionId = IdWorker.get32UUID();
        return RestResp.ok(ImgVerifyCodeRespDto.builder()
                .sessionId(sessionId)
                .img(verifyCodeManager.genImgVerifyCode(sessionId))
                .build());
    }
}
