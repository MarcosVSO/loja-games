package br.com.supera.game_store.model.repositories;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.supera.game_store.model.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	Optional<Product> findById(long id);

}
