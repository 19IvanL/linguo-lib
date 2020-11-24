
import java.time.LocalDateTime;

import org.hibernate.Session;
import org.hibernate.Transaction;

import ams2.linguo.hibernate.model.*;
import ams2.linguo.hibernate.util.HibernateUtil;

public class MainDemo {
	
	public static void main(String[] args) {
		Transaction t = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {            
        	t = session.beginTransaction();
            
            // Users
            User user = new User("Iván López Liñán", "ilopezli", LocalDateTime.now());
            Avatar avatar = new Avatar(user, "www.hola.com");
            
            // Courses
            Course course1 = new Course("ES", "EN");
            Course course2 = new Course("ES", "PT");
            
            // Saves
            session.save(user);
            session.save(avatar);
            session.save(course1);
            session.save(course2);
            
            // Final commit
            t.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
	}
}
