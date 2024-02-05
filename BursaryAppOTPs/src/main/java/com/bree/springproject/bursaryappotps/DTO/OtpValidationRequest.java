package com.bree.springproject.bursaryappotps.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OtpValidationRequest {
    private String username;
    private String otpNumber;
}
