package com.xworkz.Ecommerce;


    import lombok.*;

    import java.io.Serializable;

    @Setter
    @Getter
    @NoArgsConstructor
    @AllArgsConstructor
    @ToString

    public class CustomerDTO implements Serializable {
        private int customerId;
        private String customerName;
        private String emailId;
        private long phoneNumber;
        private String password;
        private String address;
    }

