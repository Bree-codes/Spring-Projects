package com.bree.springproject.bursaryemailing.DTO;

import lombok.Data;

@Data
public class MailRequest {
    private String from;
    private String to;
    private String subject;

}
