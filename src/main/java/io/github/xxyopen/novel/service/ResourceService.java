package io.github.xxyopen.novel.service;

import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.dto.resp.ImgVerifyCodeRespDto;

import java.io.IOException;

/**
 * 资源（图片/视频/文档）相关服务类
 *
 * @author :Contanstin
 * @create 2022/7/18 21:52
 */
public interface ResourceService {
    /**
     * 获取图片验证码
     *
     * @throws IOException 验证码图片生成失败
     * @return Base64编码的图片
     */
    RestResp<ImgVerifyCodeRespDto> getImgVerifyCode() throws IOException;

}
