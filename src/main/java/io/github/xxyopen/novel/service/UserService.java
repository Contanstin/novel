package io.github.xxyopen.novel.service;

import io.github.xxyopen.novel.core.common.resq.RestResp;
import io.github.xxyopen.novel.core.common.resq.UserLoginReqDto;
import io.github.xxyopen.novel.core.common.resq.UserLoginRespDto;
import io.github.xxyopen.novel.dto.req.UserRegisterReqDto;
import io.github.xxyopen.novel.dto.resp.UserRegisterRespDto;

/**
 * 会员模块 服务类
 *
 * @author :Contanstin
 * @create 2022/7/18 22:07
 */
public interface UserService {

    /**
     * 用户注册
     *
     * @param dto 注册参数
     * @return JWT
     */
    RestResp<UserRegisterRespDto> register(UserRegisterReqDto dto);

    /**
     * 用户登录
     *
     * @param dto 登录参数
     * @return JWT + 昵称
     */
    RestResp<UserLoginRespDto> login(UserLoginReqDto dto);

}
