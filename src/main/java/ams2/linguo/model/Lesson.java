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

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "course_id", referencedColumnName = "id")
    private Course course;

	@ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lesson_category_id", referencedColumnName = "id")
	private LessonCategory lessonCategory;

	public Lesson() {}

	public Lesson(Course course, LessonCategory lessonCategory) {
		this.course = course;
		this.lessonCategory = lessonCategory;
	}

	public Lesson(long id, Course course, LessonCategory lessonCategory) {
		this.id = id;
		this.course = course;
		this.lessonCategory = lessonCategory;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
