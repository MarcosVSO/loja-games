package br.com.supera.game_store.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supera.game_store.model.entities.Product;
import br.com.supera.game_store.model.repositories.ProductRepository;

@Service
public class ProductBusiness {
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
}
