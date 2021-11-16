package com.esdo.bepilot.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String CustomerKey;

    @Column(columnDefinition = "VARCHAR(100)")
    private String avatar;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String phone;

    private BigDecimal money;

    private BigDecimal companyName;

}
