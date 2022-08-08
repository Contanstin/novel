package io.github.xxyopen.novel.core.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * Xss 过滤配置属性
 *
 * @author :Contanstin
 * @create 2022/8/9 0:28
 */
@ConfigurationProperties(prefix = "novel.xss")
public record  XssProperties(Boolean enabled, List<String> excludes) {

}
