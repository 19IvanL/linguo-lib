package ams2.linguo.interfaces;

import java.util.List;

import ams2.linguo.model.Course;

public interface ICourseQueries {
	public Course insertCourseByBaseAndTargetLanguages(String baseLanguage, String targetLanguage);
	public List<Course> getCoursesByBaseAndTargetLanguages(String baseLanguage, String targetLanguage);
}
