package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dto.CartItemDto;
import com.xworkz.ecommerce.dto.UserDto;

public interface UserCartService {
    void validateAndSave(UserDto dto);


}
