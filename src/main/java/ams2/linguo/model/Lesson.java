package ams2.linguo.model;

import javax.persistence.*;

@Entity
@Table(name = "lesson")
public class Lesson {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private long id;
	
	@Column
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_category_id", referencedColumnName = "id")
	private LessonCategory lessonCategory;

	public Lesson() {}

	public Lesson(String name, Course course, LessonCategory lessonCategory) {
		this.name = name;
		this.course = course;
		this.lessonCategory = lessonCategory;
	}

	public Lesson(long id, String name, Course course, LessonCategory lessonCategory) {
		this.id = id;
		this.name = name;
		this.course = course;
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

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public LessonCategory getLessonCategory() {
		return lessonCategory;
	}

	public void setLessonCategory(LessonCategory lessonCategory) {
		this.lessonCategory = lessonCategory;
	}

}
