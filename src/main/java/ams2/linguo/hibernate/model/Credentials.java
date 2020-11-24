package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "credentials")
public class Credentials {

	@Id
	private Long userId;

	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;

	@OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

	public Credentials() {}

	public Credentials(String email, String password, User user) {
		this.email = email;
		this.password = password;
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
