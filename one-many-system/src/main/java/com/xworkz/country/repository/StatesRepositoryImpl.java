package com.xworkz.country.repository;

import com.xworkz.country.Entity.EntityManagerFactorySingleton;
import com.xworkz.country.dto.CountryDto;
import com.xworkz.country.dto.StatesDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

public class StatesRepositoryImpl implements  StatesRepository{

    @Override
    public void addstateinfo(CountryDto dto) {

        EntityManager entityManager= EntityManagerFactorySingleton.getFactory().createEntityManager();
       entityManager.getTransaction().begin();
       entityManager.merge(dto);
       entityManager.getTransaction().commit();

    }

    @Override
    public CountryDto getcountryInfoById(int id) {
        EntityManager entityManager=EntityManagerFactorySingleton.getFactory().createEntityManager();
        Query query=entityManager.createNamedQuery("getcountryInfoById").setParameter("id",id);
        StatesDto statesDto=(StatesDto) query.getSingleResult();
        return statesDto.getCountryDto();
    }
}
