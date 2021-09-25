package br.com.supera.game_store.model.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cart")
public class Cart {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long id;
	
	@Column(name = "frete")
	private float frete;
	
	@Column(name = "total")
	private float total;
	
	@ManyToMany
	private List<Product> products;
	
	public Cart() {
		this.frete = 0;
		this.total = 0;
	}
	
	public Cart(long id, float frete, float total, List<Product> products) {
		this.id = id;
		this.frete = frete;
		this.total = total;
		this.products = products;
	}
	
	public long getId() {
		return this.id;
	}
	
	public void setFrete(float frete) {
		this.frete = frete;
	}
	
	public float getFrete() {
		return this.frete;
	}
	
	public void setTotal(float total) {
		this.total = total;
	}
	
	public float getTotal() {
		return this.total;
	}
	
	public List<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
	public void addProduct(Product product) {
		this.products.add(product);
	}
}
