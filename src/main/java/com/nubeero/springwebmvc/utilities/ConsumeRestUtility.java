package com.nubeero.springwebmvc.utilities;


import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ConsumeRestUtility {


    private static Logger logger = LoggerFactory.getLogger(ConsumeRestUtility.class);

    Quote anyQuote;

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }


//    @Bean
//    @Profile("!test")
    public CommandLineRunner getRandomQuote(RestTemplate restTemplate) throws Exception{
        return args->{


            logger.info("Running my custom CommandLineRunner logic!");
            Quote quote = restTemplate.getForObject("http://localhost:8080/api/1", Quote.class);
            logger.info(quote.toString());
        };
    }


    @Bean
    public CommandLineRunner getCustomQuoteRunner(Quote myquote){
        return args->{
                logger.info(myquote.toString());
        };
    }
    @Bean
    public Quote getMyCustomQuote(){
            Quote quoter=new Quote("musical", new Value(99,"Truth is stranger than fiction"));
            return quoter;
    }
}
