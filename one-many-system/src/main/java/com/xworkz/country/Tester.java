package com.xworkz.country;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.StatesDto;
import com.xworkz.country.service.StatesService;
import com.xworkz.country.service.StatesServiceImpl;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<StatesDto>statesDtos=new ArrayList<>();

        CountryDto countryDto=new CountryDto();
        countryDto.setId(1);
        countryDto.setName("india");
        countryDto.setNoOfstates(30);


        StatesDto statesDto=new StatesDto();
        statesDto.setNames("karnataka");
        statesDtos.add(statesDto);
        countryDto.setDtos(statesDtos);

        StatesDto statesDto1=new StatesDto();
        statesDto1.setNames("delhi");
        statesDtos.add(statesDto1);
        countryDto.setDtos(statesDtos);

        StatesDto statesDto2=new StatesDto();
        statesDto2.setNames("hydrabad");
        statesDtos.add(statesDto2);
        countryDto.setDtos(statesDtos);

       // countryDto.setDtos(statesDtos);
        statesDto.setCountryDto(countryDto);
        statesDto1.setCountryDto(countryDto);
        statesDto2.setCountryDto(countryDto);

        StatesService statesService=new StatesServiceImpl();
        statesService.validateAndSave(countryDto);

    }
}
