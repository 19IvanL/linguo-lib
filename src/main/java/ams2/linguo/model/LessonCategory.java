package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "lesson_category")
public class LessonCategory implements Serializable {

	private static final long serialVersionUID = -8427113571522271620L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String title;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;
	
	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "icon_id", referencedColumnName = "id")
	private Icon icon;

	public LessonCategory() {}
	
	public LessonCategory(String title, Course course) {
		this.title = title;
		this.course = course;
	}

	public LessonCategory(long id, String title, Course course) {
		this.id = id;
		this.title = title;
		this.course = course;
	}
	
	public LessonCategory(long id, String title, Course course, Icon icon) {
		this.id = id;
		this.title = title;
		this.course = course;
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
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Icon getIcon() {
		return icon;
	}

	public void setIcon(Icon icon) {
		this.icon = icon;
	}

}
