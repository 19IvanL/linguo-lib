package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "shop_item")
public class ShopItem implements Serializable {

	private static final long serialVersionUID = -6951710457297762175L;

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
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "icon_id", referencedColumnName = "id")
	private Icon icon;
	
	public ShopItem() {}
	
	public ShopItem(String name, String description, String category, int cost) {
		this.name = name;
		this.description = description;
		this.category = category;
		this.cost = cost;
	}

	public ShopItem(Long id, String name, String description, String category, int cost) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.category = category;
		this.cost = cost;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

}
