package ams2.linguo.model;

import javax.persistence.*;

@Entity
@Table(name = "lesson_category")
public class LessonCategory {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "icon_id", referencedColumnName = "id")
	private Icon icon;

	public LessonCategory() {}

	public LessonCategory(long id, String title) {
		this.id = id;
		this.title = title;
	}
	
	public LessonCategory(long id, String title, Icon icon) {
		this.id = id;
		this.title = title;
		this.icon = icon;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

}
