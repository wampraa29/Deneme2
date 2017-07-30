package gamesPack;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new Configuration();
		cfg.configure("gamesPack/games.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx =s.beginTransaction();
		System.out.println("ali");
		Games g = new Games();
		g.setId(1);
		g.setName("nfs");
		g.setSpace(500);
		Rpg r = new Rpg();
		r.setId(2);
		r.setName("call of");
		r.setSpace(150);
		Arcade a = new Arcade();
		a.setId(3);
		a.setName("cs");
		a.setSpace(175);
		s.save(g);
		s.save(r);
		s.save(a);
		s.flush();
		tx.commit();
	}

}
