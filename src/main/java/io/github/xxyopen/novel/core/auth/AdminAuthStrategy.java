package io.github.xxyopen.novel.core.auth;

import io.github.xxyopen.novel.core.common.exception.BusinessException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 平台后台管理系统 认证授权策略
 *
 * @author :Contanstin
 * @create 2022/7/18 23:29
 */
@Component
@RequiredArgsConstructor
public class AdminAuthStrategy implements AuthStrategy{
    @Override
    public void auth(String token, String requestUri) throws BusinessException {
        // TODO 平台后台 token 校验
    }
}
