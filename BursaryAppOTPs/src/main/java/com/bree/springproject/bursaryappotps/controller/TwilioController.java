package com.bree.springproject.bursaryappotps.controller;

import com.bree.springproject.bursaryappotps.DTO.OtpRequest;
import com.bree.springproject.bursaryappotps.DTO.OtpResponse;
import com.bree.springproject.bursaryappotps.DTO.OtpValidationRequest;
import com.bree.springproject.bursaryappotps.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/otp")
public class TwilioController {

    @Autowired
    private SmsService smsService;

    @GetMapping("/process")
    public String processSMS() {
        return "SMS sent";
    }

    @PostMapping("/send-otp")
    public OtpResponse sendOtp(@RequestBody OtpRequest otpRequest) {
        log.info("inside sendOtp : "+otpRequest.getUsername());
        return smsService.sendSMS(otpRequest);
    }

    @PostMapping("/validate-otp")
    public String validateOtp(@RequestBody OtpValidationRequest otpValidationRequest) {
        log.info("inside validateOtp : "+otpValidationRequest.getUsername()+" "+otpValidationRequest.getOtpNumber());
        return smsService.validateOtp(otpValidationRequest);
    }

}
