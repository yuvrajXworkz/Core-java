package com.xworkz.shop;

import com.xworkz.shop.dto.MallDto;
import com.xworkz.shop.dto.ShopDto;
import com.xworkz.shop.service.ShopService;
import com.xworkz.shop.service.ShopServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Tester {

    public static void main(String[] args) {

        List<ShopDto> shopDtos=new ArrayList<>();

        MallDto mallDto =new MallDto();
        mallDto.setMallid(1);
        mallDto.setMallname("lulu");
        mallDto.setLocation("banglore");

        ShopDto shopDto= new ShopDto();
        shopDto.setType("sports");
        shopDtos.add(shopDto);

        ShopDto shopDto1=new ShopDto();
        shopDto1.setType("supermarkets");
        shopDtos.add(shopDto1);

        ShopDto shopDto2=new ShopDto();
        shopDto2.setType("electronices");
        shopDtos.add(shopDto2);


        mallDto.setDtos(shopDtos);
        ShopService shopService=new ShopServiceImpl();
        shopService.validateAndSave(mallDto);

    }
}
