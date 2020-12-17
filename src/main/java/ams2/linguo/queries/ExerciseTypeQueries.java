package ams2.linguo.queries;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.interfaces.IExerciseTypeQueries;
import ams2.linguo.model.ExerciseType;
import ams2.linguo.model.Lesson;
import ams2.linguo.util.HibernateUtil;

public class ExerciseTypeQueries implements IExerciseTypeQueries {

	@Override
	public ExerciseType getExerciseTypeById(long id) {
		ExerciseType exerciseType = null;
		String queryText = "FROM ExerciseType et WHERE et.id = " + id;
		try (Session session = HibernateUtil.getSessionFactory().getCurrentSession()) {
			Transaction transaction = session.beginTransaction();
			Query query = session.createQuery(queryText);
			exerciseType = (ExerciseType) query.getSingleResult();
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return exerciseType;
	}

}
