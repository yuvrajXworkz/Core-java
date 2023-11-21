package com.xworkz.shop.repository;

import com.xworkz.shop.Entitymanager.EnitymanagerFactorySingleton;
import com.xworkz.shop.dto.MallDto;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class ShopRepositoryImpl implements ShopRepository{

    @Override
    public void addStateinfo(MallDto dto) {
        EntityManager entityManager = EnitymanagerFactorySingleton.getFactory().createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.clear();
        entityManager.merge(dto);
        entityManager.getTransaction().commit();
    }
}
