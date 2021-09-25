package br.com.supera.game_store.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.game_store.business.CartBusiness;
import br.com.supera.game_store.model.entities.Cart;

@RestController
@RequestMapping(value = "/carts")
public class CartCrtl {
	@Autowired
	private CartBusiness business;
	
	@GetMapping
	public ResponseEntity<List<Cart>> findAll(){
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.OK;
		List<Cart> list = business.findAll();
		if (list.size() == 0) {
			status = HttpStatus.NO_CONTENT;
		}
		return new ResponseEntity<List<Cart>>(list, headers, status);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Cart> findById(@PathVariable long id){
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.OK;
		Cart cart = new Cart();
		cart = business.findById(id);
		return new ResponseEntity<Cart>(cart,headers, status);
	}
	
	@PostMapping(value = "/{id}/addToCart/{productId}")
	public ResponseEntity<Void> addToCart(@PathVariable long id, @PathVariable long productId){
		HttpHeaders header = new HttpHeaders();
		HttpStatus status = HttpStatus.OK;
		business.addToCart(id, productId);
		return new ResponseEntity<Void>(null,header,status);
	}
}
