package br.com.supera.game_store.ctrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.supera.game_store.business.ProductBusiness;
import br.com.supera.game_store.model.entities.Product;

@RestController
@RequestMapping(value="/products")
public class ProductCtrl {
	@Autowired
	private ProductBusiness business;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.OK;
		List<Product> list = business.findAll();
		if (list.size() == 0) {
			status = HttpStatus.NO_CONTENT;
		}
		return new ResponseEntity<List<Product>>(list, headers, status);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable long id){
		HttpHeaders headers = new HttpHeaders();
		HttpStatus status = HttpStatus.OK;
		Product product = new Product();
		product = business.findById(id);
		return new ResponseEntity<Product>(product, headers, status);
	}
}
