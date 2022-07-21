package io.github.xxyopen.novel.dto;

import lombok.Builder;
import lombok.Data;

import java.io.Serial;

/**
 * 作家信息 DTO
 *
 * @author :Contanstin
 * @create 2022/7/18 23:28
 */
@Data
@Builder
public class AuthorInfoDto {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;

    private String penName;

    private Integer status;
}
