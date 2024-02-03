package com.bree.springproject.bursaryemailing.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MailResponse {
    private String message;
    private Boolean status;
}
