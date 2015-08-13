package net.softengine.exam;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created with IntelliJ IDEA.
 * User: SHAHIN_PC
 * Date: 8/11/15
 * Time: 10:04 PM
 * To change this template use File | Settings | File Templates.
 */

@Controller
@RequestMapping("/exam/")
public class ExamController {

    @RequestMapping(value = "go", method = RequestMethod.GET)
    public
    @ResponseBody
    String go(ModelMap model) {
        model.addAttribute("message", "Small School Manager 2");
        return new Gson().toJson("Hello");
    }
}
