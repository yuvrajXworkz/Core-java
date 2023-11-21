package com.xworkz.ecommerce.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "cart_item")
public class CartItemDto {
    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")

    @Column(name = "cart_id")
    private int cartItemId;

    @Column(name = "product_id")
    private  long productid;

    @Column(name = "quantity")
    private  int quantity;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private  Date modifiedAt;

}
