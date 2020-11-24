package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "shop_item")
public class ShopItem {
	
	@Id
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "cost")
	private int cost;
	
	// TODO Integrate icons
	
}
