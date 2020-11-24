package ams2.linguo.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "avatar")
public class Avatar {

	@Id
	private Long userId;

	@Column(name = "url")
	private String url;

	@OneToOne(targetEntity = User.class)
    @JoinColumn(name = "user_id")
    @MapsId
    private User user;

	public Avatar() {}

	public Avatar(User user, String url) {
		this.user = user;
		this.url = url;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
