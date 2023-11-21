package com.xworkz.ecommerce.repository;

import com.xworkz.ecommerce.dto.CartItemDto;
import com.xworkz.ecommerce.dto.UserDto;

public interface UserCartRepository {
    void Save(UserDto dto);
}
