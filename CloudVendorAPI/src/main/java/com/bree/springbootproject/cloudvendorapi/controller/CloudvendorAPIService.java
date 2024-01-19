package com.bree.springbootproject.cloudvendorapi.controller;

import com.bree.springbootproject.cloudvendorapi.model.CloudVendor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudvendorAPIService {

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorId,String vendorName, String vendorAddress, String vendorPhoneNummber){
        return new CloudVendor("C0011","Stephen Hope" ,"234 Kiambu" , "011234589");
    }


}
