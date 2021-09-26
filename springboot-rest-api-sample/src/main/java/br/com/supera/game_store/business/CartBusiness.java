package br.com.supera.game_store.business;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

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
	private ProductBusiness productBusiness;
	
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
	
	public Cart insert(Cart cart) {
		this.productBusiness.insert(cart.getProducts());
		BigDecimal sum = new BigDecimal("0.00");
		float freteTotal = 0;
		for (Product p : cart.getProducts()) {
			sum = sum.add(p.getPrice());
			freteTotal += 10;
		}
		cart.setTotal(sum);
		BigDecimal big250 = new BigDecimal(250);
		if (sum.compareTo(big250) > 0) {
			freteTotal = 0;
		}
		cart.setFrete(freteTotal);
		return repository.saveAndFlush(cart);
	}
}
