package com.bree.springbootannotations.propertysource.PropertySource;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
//@PropertySource("classpath:application.properties")
@PropertySources({
        @PropertySource("classpath:application.properties"),
        @PropertySource("classpath:mail.properties")
})
public class Springconfig {

}
