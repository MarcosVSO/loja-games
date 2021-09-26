package br.com.supera.game_store.model.repositories;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.supera.game_store.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Optional<Product> findById(long id);
	
	@Query("SELECT p FROM Product p ORDER BY p.name ASC")
	public List<Product> findAllAlphabetic();
	
	@Query("SELECT p FROM Product p ORDER BY p.price ASC")
	public List<Product> findAllPriceAsc();
	
	@Query("SELECT p FROM Product p ORDER BY p.score ASC")
	public List<Product> findAllScoreAsc();
	
}
