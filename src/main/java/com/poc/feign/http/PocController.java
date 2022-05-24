package com.poc.feign.http;

import com.poc.feign.http.dto.AddressReponse;
import com.poc.feign.service.PocService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/address")
public class PocController {

    @Autowired
    private PocService pocService;

    @GetMapping("/{zipCode}")
    public ResponseEntity<AddressReponse> getAddress(@PathVariable String zipCode) {
        return ResponseEntity.ok(pocService.getAddress(zipCode));
    }
}
