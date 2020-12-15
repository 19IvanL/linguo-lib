package ams2.linguo.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "lesson")
public class Lesson implements Serializable {

	private static final long serialVersionUID = 542074278752320862L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_category_id", referencedColumnName = "id")
	private LessonCategory lessonCategory;

	public Lesson() {}

	public Lesson(String name, LessonCategory lessonCategory) {
		this.name = name;
		this.lessonCategory = lessonCategory;
	}

	public Lesson(long id, String name, LessonCategory lessonCategory) {
		this.id = id;
		this.name = name;
		this.lessonCategory = lessonCategory;
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


	public LessonCategory getLessonCategory() {
		return lessonCategory;
	}

	public void setLessonCategory(LessonCategory lessonCategory) {
		this.lessonCategory = lessonCategory;
	}

}
