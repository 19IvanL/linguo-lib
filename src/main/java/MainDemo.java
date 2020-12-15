
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.model.*;
import ams2.linguo.util.HibernateUtil;

public class MainDemo {

	public static void main(String[] args) {
		Transaction t = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {            
			t = session.beginTransaction();

			// User
			User user1 = new User("Iván López Liñán", "ilopezli", LocalDateTime.now());
			session.save(user1);

			User user2 = new User("Paco Pena Carreno", "ppenaca", LocalDateTime.now());
			session.save(user2);

			User user3 = new User("Carpenter Brut", "cbrut", LocalDateTime.now());
			session.save(user3);

			// Avatar
			Avatar avatar = new Avatar(user1, "www.hola.com");
			session.save(avatar);

			// Friendship
			Friendship friendship1 = new Friendship(user1, user2, LocalDateTime.now());
			session.save(friendship1);

			Friendship friendship2 = new Friendship(user2, user1, LocalDateTime.now());
			session.save(friendship2);

			Friendship friendship3 = new Friendship(user1, user3, LocalDateTime.now());
			session.save(friendship3);

			// League
			League league1 = new League("Copa Plata", LocalDateTime.now(), LocalDateTime.now());
			session.save(league1);

			LeagueDivision leagueDivision1 = new LeagueDivision(0L, user1, league1, 200);
			session.save(leagueDivision1);

			// Course
			Course course1 = new Course("ES", "EN");
			session.save(course1);

			Course course2 = new Course("ES", "PT");
			session.save(course2);

			Course course3 = new Course("EN", "ES");
			session.save(course3);

			// LessonCategory
			LessonCategory lessonCategory1 = new LessonCategory("Comida", course1);
			session.save(lessonCategory1);

			LessonCategory lessonCategory2 = new LessonCategory("Vehicles", course2);
			session.save(lessonCategory2);

			// Lesson
//			Lesson lesson1 = new Lesson("Comida 1", lessonCategory1);
//			session.save(lesson1);
//
//			Lesson lesson2 = new Lesson("Comida 2", lessonCategory1);
//			session.save(lesson2);
//
//			Lesson lesson3 = new Lesson("Food 3", lessonCategory2);
//			session.save(lesson3);

			// Final commit
			t.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
