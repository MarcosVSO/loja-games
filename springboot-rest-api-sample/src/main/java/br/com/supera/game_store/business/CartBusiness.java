package br.com.supera.game_store.business;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.supera.game_store.model.entities.Cart;
import br.com.supera.game_store.model.entities.Product;
import br.com.supera.game_store.model.repositories.CartRepository;
import br.com.supera.game_store.model.repositories.ProductRepository;

@Service
public class CartBusiness {

	@Autowired
	private CartRepository repository;
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Cart> findAll(){
		return repository.findAll();
	}
	
	public Cart findById(long id) {
		Optional<Cart> cart = repository.findById(id);
		if (cart.isEmpty()) {
			System.out.println("Carrinho não encontrado");
		}
		return cart.get();
	}
	
	public void addToCart(long cartId, long productId) {
		Optional<Cart> targetCart = repository.findById(cartId);
		Optional<Product> targetProduct = productRepository.findById(productId);
		targetCart.get().addProduct(targetProduct.get());
	}
}
