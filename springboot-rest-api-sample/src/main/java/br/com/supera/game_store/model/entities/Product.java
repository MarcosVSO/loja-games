package br.com.supera.game_store.model.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	   @Id
	   @GeneratedValue(strategy = GenerationType.IDENTITY)
	   @Column(name = "id")
	   private long id;
	   
	   @Column(name = "name")
	   private String name;
	   
	   @Column(name = "price")
	   private BigDecimal price;

	   @Column(name = "score")
	   private short score;

	   @Column(name = "image")
	   private String image;
	   
	   public Product() {
		   
	   }
	   
	   public Product(String name, BigDecimal price, short score, String image) {
		   this.name = name;
		   this.price = price;
		   this.score = score;
		   this.image = image;
	   }
	   
	   public Product(long id,String name, BigDecimal price, short score, String image) {
		   this.id = id;
		   this.name = name;
		   this.price = price;
		   this.score = score;
		   this.image = image;
	   }

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public BigDecimal getPrice() {
			return price;
		}
		
		public void setPrice(BigDecimal price) {
			this.price = price;
		}
		
		public short getScore() {
			return score;
		}
		
		public void setScore(short score) {
			this.score = score;
		}
		
		public String getImage() {
			return image;
		}
		
		public void setImage(String image) {
			this.image = image;
		}
}
