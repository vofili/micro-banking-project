package com.nubeero.springwebmvc.utilities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConsumeRestConfiguration {


    static String url="https://s3.eu-west-1.amazonaws.com/hackajob-assets1.p.hackajob/challenges/sainsbury_products/products_v2.json";
    static String portNo="443";
    static String username="default";
    static String password="default";

    @Bean
    public CoreBankingServiceConfig coreBankingServiceConfig(){
        return new CoreBankingServiceConfig(url,portNo,username,password);

    }


}


