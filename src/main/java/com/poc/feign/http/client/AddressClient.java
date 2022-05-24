package com.poc.feign.http.client;

import com.poc.feign.domain.Address;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@FeignClient(name = "viaCep", url = "https://viacep.com.br/ws")
public interface AddressClient {

    @GetMapping("/{zipCode}/json")
    @ResponseBody
    Address getAddress(@PathVariable String zipCode);
}
