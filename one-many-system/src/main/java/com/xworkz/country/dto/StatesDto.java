package com.xworkz.country.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "states")
@NamedQuery(name = "getcountryInfoById",query = "select  dto from StatesDto dto where dto.Statesid=:id ")
public class StatesDto {

    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    @Column(name = "states_id")
    private int Statesid;

    @Column(name = "names")
    private String names;

    @ManyToOne
    @JoinColumn(name = "id")
    private  CountryDto countryDto;


}
