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
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String userKey;

    @Column(columnDefinition = "VARCHAR(100)")
    private String avatar;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    private BigDecimal amountMoneyReceive;

    private BigDecimal moneyWithdrawn;

    private BigDecimal moneyRemaining;

    private BigDecimal numberOfMissionDone;
}
