package com.nubeero.springwebmvc;

import com.nubeero.springwebmvc.calculator.Calculator;
import com.nubeero.springwebmvc.calculator.Operation;
import com.nubeero.springwebmvc.utilities.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.Collection;

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

//    @Bean
//    public Calculator calculator(Collection<Operation> operations){
//        return new Calculator(operations);
//    }

    @Bean
    public ApplicationRunner calculationRunner(Calculator calc, @Value("${lhs}")int lhs, @Value("${rhs}")int rhs, @Value("${op}") char op){
        return args-> calc.calculate(lhs,rhs,op);
    }



    public static void main(String[] args) {
        var ctx = SpringApplication.run(SpringWebMvcApplication.class, args);

//        var calc = ctx.getBean(Calculator.class);
//        calc.calculate(10,20,'+');
//        calc.calculate(20,5,'*');
//        calc.calculate(30, 25, '-');

//        try(var ctx = SpringApplication.run(SpringWebMvcApplication.class, args)){
//               var names = ctx.getBeanDefinitionNames();
//               Arrays.stream(names).forEach(System.out::println);
//
//
//            }
        }

}
