package com.xworkz.movie.repository;

import com.xworkz.movie.dto.MovieTcketsDto;

public interface BookmyShowRepository {
    public boolean save(MovieTcketsDto dto);
    public MovieTcketsDto getMovieticketsinfoById(int id);
    public MovieTcketsDto getMovieticketsinfoByName(String name);
    public boolean updateNoOfTicketsByid(int updatenoofTickets, int id);
    public boolean deleteMovieticketsById(int id);

    public  boolean modifyMoviePriceByTheaterName(double movieprice,String theatreName);

    public  boolean deleteBookingBymovieId(int movieId);
}
