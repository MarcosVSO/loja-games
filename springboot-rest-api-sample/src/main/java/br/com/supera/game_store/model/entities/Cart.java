package br.com.supera.game_store.model.entities;

import java.math.BigDecimal;
import java.util.Set;

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
	private BigDecimal total;
	
	@ManyToMany
	private Set<Product> products;
	
	public Cart() {
		this.frete = 0;
		this.total = new BigDecimal(0);
	}
	
	public Cart(long id, float frete, BigDecimal total, Set<Product> products) {
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
	
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	public BigDecimal getTotal() {
		return this.total;
	}
	
	public Set<Product> getProducts(){
		return this.products;
	}
	
	public void setProducts(Set<Product> products) {
		this.products = products;
	}
}
