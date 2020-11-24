package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coins {
	
	@Id
	private Long userId;
	
	@Column(name = "currency")
	private int currency;

}
