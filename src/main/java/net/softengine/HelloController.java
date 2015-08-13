package net.softengine;

import com.google.gson.Gson;
import net.softengine.security.model.ManyTest;
import net.softengine.security.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class HelloController {
	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");

        SessionFactory sf =  new Configuration().configure("../hibernate.cfg.xml").buildSessionFactory();
        Session session = sf.openSession();
        session.beginTransaction();


        ManyTest m1 = new ManyTest();
        session.save(m1);
        ManyTest m2 = new ManyTest();
        session.save(m2);
        ManyTest m3 = new ManyTest();
        session.save(m3);

        List<ManyTest> ml = new ArrayList<ManyTest>();
        ml.add(m1);
        ml.add(m2);
        ml.add(m3);




        User user = new User();
        user.setName("My Name");
        user.getManyTestList().addAll(ml);
        session.save(user);
        session.getTransaction().commit();
        session.close();

		return  new Gson().toJson("OKEY :)");
	}
}