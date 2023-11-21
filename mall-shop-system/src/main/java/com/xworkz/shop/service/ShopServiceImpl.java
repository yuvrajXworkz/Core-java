package com.xworkz.shop.service;

import com.xworkz.shop.dto.MallDto;
import com.xworkz.shop.repository.ShopRepository;
import com.xworkz.shop.repository.ShopRepositoryImpl;

public class ShopServiceImpl implements  ShopService{

    boolean isshopidvalidte=false;
    boolean isshopnamesvalidate=false;
    boolean isshoptypevalidate=false;

    ShopRepository shopRepository;
    public ShopServiceImpl(){
        shopRepository=new ShopRepositoryImpl();
    }

    @Override
    public void validateAndSave(MallDto dto) {

        if (dto!=null){
            if (dto.getMallid()>0){
                isshopidvalidte=true;
            }
            if (dto.getMallname()!=null) {
                isshopnamesvalidate=true;

            }if (dto.getLocation()!=null){
                isshoptypevalidate=true;
            }
        }
        if (isshopidvalidte==true&&isshopnamesvalidate==true&&isshoptypevalidate==true){
            shopRepository.addStateinfo(dto);
        }

    }
}
