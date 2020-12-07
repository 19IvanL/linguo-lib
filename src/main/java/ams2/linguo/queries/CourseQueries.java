package ams2.linguo.queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.ICourseQueries;
import ams2.linguo.model.Course;
import ams2.linguo.util.HibernateUtil;

public class CourseQueries implements ICourseQueries {
	
	public List<Course> getCoursesByBaseAndTargetLanguage(String baseLanguage, String targetLanguage) {
		String queryText;
		if (!baseLanguage.isBlank() && targetLanguage.isBlank())
			queryText = "FROM Course WHERE baseLanguage = '" + baseLanguage + "'";
		else if (baseLanguage.isBlank() && !targetLanguage.isBlank())
			queryText = "FROM Course WHERE targetLanguage = '" + targetLanguage + "'";
		else
			queryText = "FROM Course WHERE baseLanguage = '" + baseLanguage + "' AND targetLanguage = '" + targetLanguage + "'";
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(queryText);
			@SuppressWarnings("unchecked")
			List<Course> courses = query.getResultList();
			transaction.commit();
			return (List<Course>)courses;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
