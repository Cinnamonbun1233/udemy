package com.example.springbeans.config;

import com.example.springbeans.service.JavaConfigService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.time.OffsetDateTime;

@Configuration
public class JavaConfig {
    @Bean("FullJavaConfigService")
    @Primary
    public JavaConfigService javaConfigService() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        JavaConfigService javaConfigService = new JavaConfigService(offsetDateTime.toString());
        javaConfigService.setDayOfMonth(offsetDateTime.getDayOfMonth());
        return javaConfigService;
    }

    @Bean("PureJavaConfigService")
    public JavaConfigService javaConfigService1() {
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        return new JavaConfigService(offsetDateTime.toString());
    }
}