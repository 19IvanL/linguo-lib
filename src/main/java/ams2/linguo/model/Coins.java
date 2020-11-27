package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "coins")
public class Coins implements Serializable {

	private static final long serialVersionUID = 3707850022410876209L;

	@Id
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user;

	@Column(name = "currency")
	private int currency;

	public Coins() {}

	public Coins(User user, int currency) {
		this.user = user;
		this.currency = currency;
	}

}
