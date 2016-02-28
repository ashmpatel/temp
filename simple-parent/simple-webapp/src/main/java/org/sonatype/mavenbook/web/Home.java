package org.sonatype.mavenbook.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;


@Controller
public class Home {


    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String listUsers(ModelMap model) {
        System.out.println("*** Logging in ***");
        model.addAttribute("user", "test");
        return "users";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String addAndReturntoHomePage() {
        System.out.println("*** Redirecting to login page ***");
        return "redirect:/rpc/login";
    }

    @RequestMapping(value = "/getlist", method = RequestMethod.GET)
    public ModelAndView getdata() {

        List<String> list = getList();

        //return back to index.jsp
        ModelAndView model = new ModelAndView("displayusers");
        model.addObject("lists", list);

        return model;

    }

    private List<String> getList() {

        List<String> list = new ArrayList<String>();
        list.add("List A");
        list.add("List B");
        list.add("List C");
        list.add("List D");
        list.add("List 1");
        list.add("List 2");
        list.add("List 3");

        return list;
    }

}
