package com.xworkz.movie.repository.impl;

import com.xworkz.movie.dto.MovieTcketsDto;
import com.xworkz.movie.repository.BookmyShowRepository;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class
BookmyShowRepositoryimpl implements BookmyShowRepository {
    @Override
    public boolean save(MovieTcketsDto dto) {
        Persistence persistence=new Persistence();
        EntityManagerFactory entityManager=Persistence.createEntityManagerFactory("com.xworkz");
        EntityManager entityManager1= entityManager.createEntityManager();
       entityManager1.getTransaction().begin();
       entityManager1.persist(dto);
       entityManager1.getTransaction().commit();

            return  false;

        }

    @Override
    public MovieTcketsDto getMovieticketsinfoById(int id) {
      return new Persistence().
              createEntityManagerFactory("com.xworkz").
              createEntityManager().find(MovieTcketsDto.class,id);


    }

    @Override
    public MovieTcketsDto getMovieticketsinfoByName(String name) {
        return  new Persistence().
                createEntityManagerFactory("com.xworkz").
    createEntityManager().find(MovieTcketsDto.class,name);
    }

    @Override
    public boolean updateNoOfTicketsByid(int updatenoofTickets, int id) {
        boolean isupdatedmovieTickets=false;
        EntityManager entityManager = new Persistence().createEntityManagerFactory("com.xworkz").
                createEntityManager();
             MovieTcketsDto dto = entityManager.find(MovieTcketsDto.class, id);

        if (dto != null) {
            dto.setNoOfTickets(updatenoofTickets);
            entityManager.getTransaction().begin();
            entityManager.merge(dto);
            entityManager.getTransaction().commit();
            isupdatedmovieTickets=true;

        }
        return isupdatedmovieTickets;

    }

    @Override
    public boolean deleteMovieticketsById(int id) {
        boolean isDeleted=false;
        EntityManager entityManager=new Persistence().createEntityManagerFactory("com.xworkz").
                createEntityManager();
        MovieTcketsDto dto=entityManager.find(MovieTcketsDto.class,id);

        if (dto!=null) {
            entityManager.getTransaction().begin();
            entityManager.remove(dto);
            entityManager.getTransaction().commit();
            isDeleted = true;
        }


      return isDeleted;
        }

    @Override
    public boolean modifyMoviePriceByTheaterName(double movieprice, String theatreName) {
        EntityManager entityManager=Persistence.createEntityManagerFactory("com.xworkz").createEntityManager();
        entityManager.getTransaction().begin();
        entityManager.createQuery("update movieTicketsDto m set m.moviePrice='"+movieprice+"'where m.theatreName='"+theatreName+"' ");
        entityManager.getTransaction().commit();

        return true;
    }
    @Override

    public boolean deleteBookingBymovieId(int movieId) {



        return false;
    }


}






