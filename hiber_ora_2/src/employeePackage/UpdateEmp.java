package employeePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx =s.beginTransaction();
		Employee emp=(Employee)s.load(Employee.class, new Integer(2));
		emp.setName("Ahmet");
		emp.setEmail("ahmet@gmail");
		emp.setMobile(123);
		s.update(emp);
		s.flush();
		tx.commit();
		s.close();
				
	}

}
