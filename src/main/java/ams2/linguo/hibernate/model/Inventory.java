package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

	@Id
	private Long userId;

	@Id
	private Long shopItemId;

	@Column(name = "quantity")
	private int quantity;
	
}
