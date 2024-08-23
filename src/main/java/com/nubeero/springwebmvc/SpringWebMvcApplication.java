package com.nubeero.springwebmvc;

import com.nubeero.springwebmvc.utilities.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class SpringWebMvcApplication {


    private static final Logger logger =LoggerFactory.getLogger(SpringWebMvcApplication.class);
    static int doBinarySearch(int[] arr,int searchItem){
        int mid=arr.length/2;
        int min=0;
        int max = arr.length;
        var result=0;
        if(arr[mid]==searchItem){
            result= mid;
        }

        return  result;
    }
    public static void main(String[] args) {
       try(var ctx= SpringApplication.run(SpringWebMvcApplication.class, args)){

           for(var names: ctx.getBeanDefinitionNames()){
               logger.info(names);
           }
       }

//        try(var ctx = SpringApplication.run(SpringWebMvcApplication.class, args)){
//               var names = ctx.getBeanDefinitionNames();
//               Arrays.stream(names).forEach(System.out::println);
//
//
//            }
        }

}
