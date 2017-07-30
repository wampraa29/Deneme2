package employeePackage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SelectEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Employee emp=(Employee)s.load(Employee.class, new Integer(2));  // Veritabanýnda id'si 1 olan kayýtýn bilgilerini çeker.
		/* Employee emp2=(Employee)s.load(Employee.class, new Integer(1));   load ile get ayný iþi yapar fakat load : kesin emin olunan verileri çekerken kullanýlýr
		                                                                       get ise emin olmadýgýn veriyi çekerken kullanýlýr. nullpointer oluþturur sadece.       */
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getMobile());
		System.out.println(emp.getEmail());
		s.close();
		

	}

}
