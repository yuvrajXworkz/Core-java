package com.xworkz.movie.dto;

import com.xworkz.movie.constants.Language;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Builder
@NamedQuery(name = " ",query = " ")
@Table(name = "movie_tickets")
public class MovieTcketsDto {

    @Id
    @Column(name = "movie_id")
    private   int id;

    @Column(name = "movie_name")
    private   String name;

    @Column(name = "language")
    @Enumerated(EnumType.STRING)
    private Language language;

    @Column(name = "location")
    private  String location;


    @Column(name = "price")
    private  double price;

    @Column(name = "theatre")
    private  String theater;

    @Column(name = "time")
    private String time;

    @Column(name = "no_of_tickets")
    private  int noOfTickets;


}
