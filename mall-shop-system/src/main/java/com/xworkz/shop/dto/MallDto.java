package com.xworkz.shop.dto;

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
@Table(name = "mall")
public class MallDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")



    @Column(name = "mall_id")
    private  int mallid;

    @Column(name = "mall_name")
    private   String mallname;


    @Column(name = "location")
    private  String location;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "mall_id")
    private List<ShopDto>dtos;

}
