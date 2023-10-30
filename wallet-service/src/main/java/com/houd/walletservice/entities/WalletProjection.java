package com.houd.walletservice.entities;

import lombok.Data;
import org.springframework.data.rest.core.config.Projection;

import java.util.Date;

@Projection(name = "fullWallet",types = Wallet.class)
public interface WalletProjection {
    public Long getId();
    public double getSolde();
    public Date getDateCreation();
    public String getDevise();
    public Long getClientId();
}
