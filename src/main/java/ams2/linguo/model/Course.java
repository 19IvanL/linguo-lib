package ams2.linguo.model;

import javax.persistence.*;

@Entity
@Table(name = "course", uniqueConstraints = {@UniqueConstraint(columnNames = {"base_language", "target_language"})})
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private long id;
	
	@Column(name = "base_language")
	private String baseLanguage;
	
	@Column(name = "target_language")
	private String targetLanguage;

	public Course() {}

	public Course(String baseLanguage, String targetLanguage) {
		this.baseLanguage = baseLanguage;
		this.targetLanguage = targetLanguage;
	}

	public Course(long id, String baseLanguage, String targetLanguage) {
		this.id = id;
		this.baseLanguage = baseLanguage;
		this.targetLanguage = targetLanguage;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBaseLanguage() {
		return baseLanguage;
	}

	public void setBaseLanguage(String baseLanguage) {
		this.baseLanguage = baseLanguage;
	}

	public String getTargetLanguage() {
		return targetLanguage;
	}

	public void setTargetLanguage(String targetLanguage) {
		this.targetLanguage = targetLanguage;
	}
	
}
