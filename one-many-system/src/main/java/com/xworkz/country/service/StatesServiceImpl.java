package com.xworkz.country.service;

import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.repository.StatesRepository;
import com.xworkz.country.repository.StatesRepositoryImpl;

public class StatesServiceImpl implements  StatesService{

    boolean isstseidvalidated=false;
    boolean isstatenamevalidated=false;


    StatesRepository statesRepository;

    public StatesServiceImpl(){
        statesRepository=new StatesRepositoryImpl();
    }
    @Override
    public void validateAndSave(CountryDto dto) {

        if (dto!=null){
            if (dto.getId()>0){
                isstseidvalidated=true;
            }
            if (dto.getName()!=null){
                isstatenamevalidated=true;
            }
        }
        if (isstseidvalidated==true&&isstatenamevalidated==true){
            statesRepository.addstateinfo(dto);
        }

    }

    @Override
    public CountryDto getcountryInfoById(int id) {
        if (id>0){
          return   statesRepository.getcountryInfoById(id);
        }
        return  null;
    }
}
