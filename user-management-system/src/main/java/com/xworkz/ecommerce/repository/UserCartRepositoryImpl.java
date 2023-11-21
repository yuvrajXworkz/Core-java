package com.xworkz.ecommerce.repository;

import com.xworkz.ecommerce.dto.CartItemDto;
import com.xworkz.ecommerce.dto.UserDto;
import com.xworkz.ecommerce.entitymanager.EntitymanagerfactorySingleton;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class UserCartRepositoryImpl implements  UserCartRepository{
    @Override
    public void Save(UserDto dto) {
        EntityManager entityManager =EntitymanagerfactorySingleton.getFactory().createEntityManager();
        EntityTransaction et = entityManager.getTransaction();
        entityManager.getTransaction().begin();
        entityManager.clear();
        entityManager.merge(dto);
        entityManager.getTransaction().commit();

    }
}
