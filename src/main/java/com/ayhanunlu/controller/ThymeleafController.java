package com.ayhanunlu.controller;

import com.ayhanunlu.dto.ProductDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThymeleafController {
    /*option command L*/

//Optional root {}
//http://localhost:8080
@GetMapping({"/","index"})
public String index (){
    return "index";
}

//###########################################################

//@ResponseBody
    //http://localhost:8080/thymeleaf1
    @GetMapping("/thymeleaf1")

//    @ResponseBody


//Model
    public String getThymeleaf1() {
//        return "Hello Is It Me You're Looking For";
        return "thymeleaf1TemplatePage";
    }


    //Model More Than One value
    //http://localhost:8080/thymeleaf2
    @GetMapping("thymeleaf2")
    public String getThymeleaf2Model(Model model) {
        model.addAttribute("key_model1", "value_model **  1- I come from the Model **");
        model.addAttribute("key_model2", "value_model **  2- I come from the Model **");
        return "thymeleaf1TemplatePage";
    }


//Model

    //http://localhost:8080/thymeleaf3
    @GetMapping("thymeleaf3")
    public String getThymeleaf3Model(Model model) {
        model.addAttribute("key_model1", "value_model ** First value from Model created with thymeleaf3");
        model.addAttribute("key_model2", "value_model ** Second value from Model created with thymeleaf3");
        return "thymeleaf_folder/thymeleaf3TemplatePage";
    }

    //http://localhost:8080/thymeleaf4
    @GetMapping("thymeleaf4")
    public String getThymeleaf4Model(Model model) {
        model.addAttribute("key_model1", "value_model ** First value fro Model created with thymeleaf4");
        return "thymeleaf4TemplatePage";
    }

    /// ///////////////////////////////////////////////////////////////////////////////////////////////
    // Model To send an Object

    //http://localhost:8080/thymeleaf5
    @GetMapping("thymeleaf5")
    public String getThymeleaf5ModelObject(Model model) {
        model.addAttribute("key_model1", "Text which will be replaces by an object");

        ProductDto productDto = ProductDto
                .builder()
                .productId(0L)
                .productName("Product 1")
                .productPrice(1000)
                .build();
        model.addAttribute("key_model2", productDto);

        return "thymeleaf5TemplatePage";
    }


    // Model to send and Object List

    //http://localhost:8080/thymeleaf6
    @GetMapping("thymeleaf6")
    public String getThymeleaf6ModelObjectList(Model model) {
        model.addAttribute("key_model1", "Text which will be replaced with a list");

        List<ProductDto> productDtoList = new ArrayList<>();
        productDtoList.add(ProductDto.builder().productId(1L).productName("Product-1").productPrice(1000).build());
        productDtoList.add(ProductDto.builder().productId(2L).productName("Product-2").productPrice(2000).build());
        productDtoList.add(ProductDto.builder().productId(3L).productName("Product-3").productPrice(3000).build());
        productDtoList.add(ProductDto.builder().productId(4L).productName("Product-4").productPrice(4000).build());

/*
        ProductDto productDto = ProductDto.builder().productId(11L).productName("Product-11").productPrice(1000).build();
        model.addAttribute("key_model2", productDto);
*/
        model.addAttribute("product_list", productDtoList);

        return "thymeleaf6TemplatePage";
    }


    //http://localhost:8080/thymeleaf7/4
    @GetMapping({ "/thymeleaf7", "/thymeleaf7/{id}"})
    public String getThymeleaf7ModelPath(Model model, @PathVariable (name = "id",required = false) Long id){

    if(id!=null) {
        model.addAttribute("key_model1", /*"Text which will be replaced by a root option"*/ "Id number= " + id);
    }else{
        model.addAttribute("key_model1", "Id number is not found");
    }

//
//        ProductDto productDto = ProductDto.builder().productId(1L).productName("Product-1").productPrice(1000).build();
//        model.addAttribute("key_model2", productDto);

    return "thymeleaf7TemplatePage";
    }
}
