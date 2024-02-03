package com.bree.springproject.valentinesmessage.service;

import freemarker.template.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MessageService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private Configuration configuration;



}
