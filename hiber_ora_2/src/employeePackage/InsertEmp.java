package employeePackage;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class InsertEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx =s.beginTransaction();
		Employee emp=new Employee();
		
		
		emp.setId(4);
		emp.setName("Metin");
		emp.setMobile(536945);
		emp.setEmail("metis@gmail.com");
	
		
			s.save(emp);
		    tx.commit();
			s.close();
		
		
}
}