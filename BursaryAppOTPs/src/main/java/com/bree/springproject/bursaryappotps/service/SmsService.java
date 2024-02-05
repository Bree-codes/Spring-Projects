package com.bree.springproject.bursaryappotps.service;

import com.bree.springproject.bursaryappotps.DTO.OtpRequest;
import com.bree.springproject.bursaryappotps.DTO.OtpResponse;
import com.bree.springproject.bursaryappotps.DTO.OtpStatus;
import com.bree.springproject.bursaryappotps.DTO.OtpValidationRequest;
import com.bree.springproject.bursaryappotps.configuration.TwilioConfig;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

@Service
public class SmsService {

    @Autowired
    private TwilioConfig twilioConfig;
    Map<String ,String> otpMap = new HashMap<>();
    public OtpResponse sendSMS(OtpRequest otpRequest) {
        OtpResponse otpResponse= null;
        try {
            PhoneNumber to = new PhoneNumber(otpRequest.getPhoneNumber());//to
            PhoneNumber from = new PhoneNumber(twilioConfig.getPhoneNumber()); // from
            String otp = generateOTP();
            String otpMessage = "Dear Customer,Your OTP is  " + otp + " for sending sms. Thank You.";
            Message message = Message
                    .creator(to, from,
                            otpMessage)
                    .create();
            otpMap.put(otpRequest.getUsername(), otp);
            otpResponse = new OtpResponse(OtpStatus.DELIVERED, otpMessage);
        } catch (Exception e) {
            e.printStackTrace();
            otpResponse = new OtpResponse(OtpStatus.FAILED, e.getMessage());
        }
        return otpResponse;
    }

    public String validateOtp(OtpValidationRequest otpValidationRequest) {
        Set<String> keys = otpMap.keySet();
        String username = null;
        for(String key : keys)
            username = key;
        if (otpValidationRequest.getUsername().equals(username)) {
            otpMap.remove(username,otpValidationRequest.getOtpNumber());
            return "OTP is valid!";
        } else {
            return "OTP is invalid!";
        }
    }

    private String generateOTP() {
        return new DecimalFormat("000000")
                .format(new Random().nextInt(999999));
    }

}

