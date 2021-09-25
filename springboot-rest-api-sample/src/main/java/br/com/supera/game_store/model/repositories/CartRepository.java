package br.com.supera.game_store.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.supera.game_store.model.entities.Cart;

public interface CartRepository extends JpaRepository<Cart,Integer>{

	Optional<Cart> findById(long id);

}
