package com.xworkz.ecommerce.dto;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Date;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_item")
public class UserDto {

    @Id
    @GenericGenerator(name = "ref",strategy = "increment")
    @GeneratedValue(generator = "ref")
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String userName;

    @Column(name = "first_name")
    private String firstname;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "password")
    private String password;

    @Column(name = "mob_no")
    private long phone;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "modified_at")
    private Date modifiedAt;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cart_id")
    private CartItemDto cartItemDto;


}
