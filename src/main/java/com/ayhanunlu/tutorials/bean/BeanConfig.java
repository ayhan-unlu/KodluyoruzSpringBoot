package com.ayhanunlu.zz_tutorials.bean;

import com.ayhanunlu.zz_tutorials.dto.BeanDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BeanConfig {

    @Bean(initMethod="initialBeanMethod44",destroyMethod="destroyBeanMethod")
    @Scope("singleton") //during project
//    @Scope("request") //during request
//    @Scope("session") //during session

    public BeanDto beanDto() {
//        return BeanDto.builder().id(0L).beanName("Current Bean Name").beanData("Current Bean Data").build();
        return BeanDto
                .builder()
                    .id(0L).beanName("Current Bean Name").beanData("Current Bean Data")
                .build();
    }
}
