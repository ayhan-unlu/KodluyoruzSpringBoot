package com.ayhanunlu.zz_tutorials.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
@Builder
public class BeanDto {

    private Long id;
    private String beanName;
    private String beanData;


//    Beginning
    public void initialBeanMethod44(){
        log.info("Before Bean Starts I am Here");
        System.out.println("The method that will work before Bean starts");
    }

//    End
    public void destroyBeanMethod(){
        log.info("After Bean ends I am Here");
        System.err.println("The method that will work after Bean ends");

    }

}
