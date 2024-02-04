package com.bree.springproject.sendingsmsaandotp.controller;

import com.bree.springproject.sendingsmsaandotp.dto.OtpRequest;
import com.bree.springproject.sendingsmsaandotp.dto.OtpResponse;
import com.bree.springproject.sendingsmsaandotp.dto.OtpValidationRequest;
import com.bree.springproject.sendingsmsaandotp.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/otp")
@Slf4j
public class TwilioController {

    @Autowired
    private SmsService smsService;

    @GetMapping("/process")
    public String processSMS() {
        return "SMS sent";
    }

    @PostMapping("/send-otp")
    public OtpResponse sendOtp(@RequestBody OtpRequest otpRequest) {
        log.info("inside sendOtp :: "+otpRequest.getUsername());
        return smsService.sendSMS(otpRequest);
    }
    @PostMapping("/validate-otp")
    public String validateOtp(@RequestBody OtpValidationRequest otpValidationRequest) {
        log.info("inside validateOtp :: "+otpValidationRequest.getUsername()+" "+otpValidationRequest.getOtpNumber());
        return smsService.validateOtp(otpValidationRequest);
    }

}
