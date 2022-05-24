package com.poc.feign.service;

import com.poc.feign.domain.Address;
import com.poc.feign.http.client.AddressClient;
import com.poc.feign.http.dto.AddressReponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PocService {

    @Autowired
    private AddressClient addressClient;

    public AddressReponse getAddress(String zipCode) {

        Address address = addressClient.getAddress(zipCode);

        AddressReponse addressReponse = new AddressReponse();

        addressReponse.setNeighborhood(address.getBairro());
        addressReponse.setCity(address.getLocalidade());
        addressReponse.setStreet(address.getLogradouro());
        addressReponse.setUf(address.getUf());

        return addressReponse;
    }
}
