package net.softengine;

import com.google.gson.Gson;
import net.softengine.admin.model.Teacher;
import net.softengine.security.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String printWelcome() {

        SessionFactory sf = new Configuration().configure("../hibernate.cfg.xml").buildSessionFactory();
        Session s = sf.openSession();
        s.beginTransaction();

        User user = new User();
        user.setName("Motin Mia");
        s.save(user);
        s.getTransaction().commit();
        s.close();




        return new Gson().toJson("Table Created Successfully !");
    }
}