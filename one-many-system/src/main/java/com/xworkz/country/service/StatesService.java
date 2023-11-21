package com.xworkz.country.service;

import com.xworkz.country.dto.CountryDto;

public interface StatesService {
    void validateAndSave(CountryDto dto);

    CountryDto getcountryInfoById(int id);

}
