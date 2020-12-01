package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory implements Serializable {

	private static final long serialVersionUID = 4139440724071299773L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "shop_item_id", referencedColumnName = "id")
    private ShopItem shopItem;

	@Column(name = "quantity")
	private int quantity;

	public Inventory() {}

	public Inventory(User user, ShopItem shopItem, int quantity) {
		this.user = user;
		this.shopItem = shopItem;
		this.quantity = quantity;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public ShopItem getShopItem() {
		return shopItem;
	}

	public void setShopItem(ShopItem shopItem) {
		this.shopItem = shopItem;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
