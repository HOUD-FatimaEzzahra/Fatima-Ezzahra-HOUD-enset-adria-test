package com.houd.walletservice.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Wallet {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private double solde;
    private Date dateCreation;
    private String devise;
    private Long clientId;

}
