package cn.itcast.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class DefaultFeignConfiguration {
    @Bean // 配置Feign 日志级别
    public Logger.Level level(){
        return Logger.Level.BASIC;
    }
}
