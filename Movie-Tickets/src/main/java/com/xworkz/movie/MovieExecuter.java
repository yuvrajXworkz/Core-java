package com.xworkz.movie;

import com.xworkz.movie.dto.MovieTcketsDto;
import com.xworkz.movie.repository.impl.BookmyShowRepositoryimpl;
import com.xworkz.movie.repository.BookmyShowRepository;
import com.xworkz.movie.constants.Language;



import java.util.Scanner;

public class MovieExecuter {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        BookmyShowRepository bs =  new BookmyShowRepositoryimpl();
        int size=scanner.nextInt();
        int id=1;
        for (int i = 0; i < size; i++) {


            System.out.println("enter the mavie id,name,language,location,price,theater,time,nooftickets");
            MovieTcketsDto movieTcketsDto = MovieTcketsDto.builder().
                    id(id++).
                    name(scanner.next()).
                    language(Language.valueOf(scanner.next())).
                    location(scanner.next()).
                    price(scanner.nextDouble()).
                    theater(scanner.next()).
                    time(scanner.next()).
                    noOfTickets(scanner.nextInt()).
                    build();
           bs .save(movieTcketsDto);
        }
        System.out.println("enter id to get movietickets info");
        MovieTcketsDto movieTcketsDto=bs.getMovieticketsinfoById(scanner.nextInt());
        System.out.println(movieTcketsDto);

        System.out.println("enter movie name by movie info");
        MovieTcketsDto movieTcketsDto1=bs.getMovieticketsinfoByName(scanner.next());
         System.out.println(movieTcketsDto1);

        System.out.println("update movie tickets by id");
        boolean isupdatemoviename=bs.updateNoOfTicketsByid(scanner.nextInt(),scanner.nextInt());
        System.out.println(isupdatemoviename);

        System.out.println("delete movietickets by id");
        boolean isdeleteMoviename=bs.deleteMovieticketsById(scanner.nextInt());
        System.out.println(isdeleteMoviename);

        System.out.println("modify movie price by theatre name");
        boolean ismodifymovieprice=bs.modifyMoviePriceByTheaterName(scanner.nextDouble(),scanner.next());
        System.out.println(ismodifymovieprice);




    }
}
