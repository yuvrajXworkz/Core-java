package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "country")
public class CountryDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    @Column(name = "id")
    private  int id;

    @Column(name = "name")
    private  String name;

    @Column(name = "no_of_states")
    private  int noOfstates;

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "id")
//    private List<StatesDto> dtos;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "countryDto")
    private List<StatesDto> dtos;


}
