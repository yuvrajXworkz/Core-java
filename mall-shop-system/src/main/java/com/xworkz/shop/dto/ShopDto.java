package com.xworkz.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "shop")
public class ShopDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")


    @Column(name = "shop_id")
    private  int shopid;

    @Column(name = "shop_names")
    private  String shopnames;

    @Column(name = "type")
    private String type;
}
