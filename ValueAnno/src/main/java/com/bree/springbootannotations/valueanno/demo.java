package com.bree.springbootannotations.valueanno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class demo {

    @Value("default name")
    private String defaultName;

    public String getDefaultName() {
        return defaultName;
    }
}
