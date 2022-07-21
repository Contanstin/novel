package io.github.xxyopen.novel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;

/**
 * 用户信息 DTO
 *
 * @author :Contanstin
 * @create 2022/7/18 23:19
 */
@Data
@Builder
public class UserInfoDto {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private Integer status;
}
