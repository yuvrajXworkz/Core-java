package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dto.CartItemDto;
import com.xworkz.ecommerce.dto.UserDto;
import com.xworkz.ecommerce.repository.UserCartRepository;
import com.xworkz.ecommerce.repository.UserCartRepositoryImpl;

public class UserCartServiceImpl implements  UserCartService {

    boolean isProductIdValidated = false;
    boolean isquntityvalidated = false;
    boolean isuserdtovalidated = false;
    boolean iscreatedAtvalidated = false;
    boolean ismodifiedvalidatedAt = false;
    UserCartRepositoryImpl userCartRepository;

    public UserCartServiceImpl() {
        userCartRepository = new UserCartRepositoryImpl();
    }

    @Override
    public void validateAndSave(UserDto dto) {
        if (dto != null) {
            if (dto.getCartItemDto().getProductid() > 0) {
                isProductIdValidated = true;
            }
            if (dto.getCartItemDto().getQuantity() > 0) {
                isquntityvalidated = true;
            }
//            if (dto.getUserDto() != null) {
//                isuserdtovalidated = true;
//            }
            if (dto.getCreatedAt()!= null) {
                iscreatedAtvalidated = true;

            }
            if (dto.getModifiedAt() != null) {
                ismodifiedvalidatedAt = true;
            }

        }
        if (isProductIdValidated == true && isquntityvalidated == true  && iscreatedAtvalidated == true && ismodifiedvalidatedAt == true) {
            userCartRepository.Save(dto);

        }
    }
}