package com.xworkz.country.repository;

import com.xworkz.country.dto.CountryDto;

public interface StatesRepository {

    void  addstateinfo(CountryDto dto);

    CountryDto getcountryInfoById(int id);
}
