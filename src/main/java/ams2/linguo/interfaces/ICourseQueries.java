package ams2.linguo.interfaces;

import java.util.List;

import ams2.linguo.model.Course;

public interface ICourseQueries {
	public List<Course> getCoursesByBaseAndTargetLanguage(String baseLanguage, String targetLanguage);
}
