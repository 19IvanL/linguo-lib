package ams2.linguo.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User implements Serializable {

	private static final long serialVersionUID = -3582591734434677368L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "username")
	private String username;
	
	@Column(name = "registration_date")
	private LocalDateTime registrationDate;

	public User() {}

	public User(String name, String username, LocalDateTime registrationDate) {
		this.name = name;
		this.username = username;
		this.registrationDate = registrationDate;
	}

	public User(long id, String name, String username, LocalDateTime registrationDate) {
		this.id = id;
		this.name = name;
		this.username = username;
		this.registrationDate = registrationDate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public LocalDateTime getregistrationDate() {
		return registrationDate;
	}

	public void setregistrationDate(LocalDateTime registrationDate) {
		this.registrationDate = registrationDate;
	}
	
}
