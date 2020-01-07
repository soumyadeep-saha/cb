package com.example.demo.service;


import com.example.demo.dto.SellerDto;

import java.util.List;

public interface UserRegistrationService {
    String registerSeller(SellerDto sellerDto);

    List<SellerDto> getSellersList();
}
