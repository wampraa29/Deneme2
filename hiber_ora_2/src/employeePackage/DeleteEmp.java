package employeePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx =s.beginTransaction();
		Employee emp=(Employee)s.load(Employee.class, new Integer(3));
		s.delete(emp);
		//s.saveOrUpdate(emp);
		s.flush();
		tx.commit();
		s.close();
		

	}

}
