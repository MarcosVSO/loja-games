package br.com.supera.game_store.database;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import br.com.supera.game_store.model.entities.Product;
import br.com.supera.game_store.model.repositories.ProductRepository;

@Configuration
public class H2DBLoadGames implements CommandLineRunner {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Override
	public void run(String... args) throws Exception {
		Product p1 = new Product(312,"Super Mario Odyssey",new BigDecimal("197.88"),(short)100,"super-mario-odyssey.png");
		Product p2 = new Product(201,"Call Of Duty Infinite Warfare",new BigDecimal("49.99"),(short)80,"call-of-duty-infinite-warfare.png");
		Product p3 = new Product(102,"The Witcher III Wild Hunt", new BigDecimal("119.5"),(short)250,"the-witcher-iii-wild-hunt.png");
		Product p4 = new Product(99, "Call Of Duty WWII", new BigDecimal("249.99"),(short)205,"call-of-duty-wwii.png");
		Product p5 = new Product(12,"Mortal Kombat XL", new BigDecimal("69.99"), (short)150,"mortal-kombat-xl.png");
		Product p6 = new Product (74, "Shards of Darkness", new BigDecimal("71.94"),(short)400,"shards-of-darkness.png");
		Product p7 = new Product (31, "Terra Média: Sombras de Mordor", new BigDecimal ("79.99"), (short)50,"terra-media-sombras-de-mordor.png");
		Product p8 = new Product (420,"FIFA 18", new BigDecimal ("195.39"), (short)325,"fifa-18.png");
		Product p9 = new Product (501,"Horizon Zero Dawn", new BigDecimal ("115.8"),(short)290,"horizon-zero-dawn.png" );
		productRepository.saveAll(Arrays.asList(p1,p2,p3,p4,p5,p6,p7,p8,p9));
		
	}

}
