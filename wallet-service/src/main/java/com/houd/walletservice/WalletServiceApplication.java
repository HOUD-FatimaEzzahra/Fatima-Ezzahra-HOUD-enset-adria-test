package com.houd.walletservice;

import com.houd.walletservice.entities.Wallet;
import com.houd.walletservice.repositories.WalletRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class WalletServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(WalletServiceApplication.class, args);
	}
	@Bean
	CommandLineRunner start(WalletRepository walletRepository){
		return args -> {
			Random random = new Random();
			// Ajout de quelques Wallets de test
			for (int i = 0; i < 5; i++) {
				Wallet wallet = Wallet.builder()
						.solde(random.nextDouble() * 1000) // Solde aléatoire entre 0 et 1000
						.dateCreation(new Date())
						.devise("EUR") // Devise par défaut
						.clientId((long) (i + 1)) // Client ID (peut être n'importe quoi pour le POC)
						.build();

				walletRepository.save(wallet);
			}
		};
	}


}
