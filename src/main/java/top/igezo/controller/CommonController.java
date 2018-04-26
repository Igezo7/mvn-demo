package top.igezo.controller;

import com.sun.tools.internal.ws.processor.model.Response;
import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import top.igezo.dao.*;

/**
 * Created by igezo on 25/04/2018.
 */
@Controller
public class CommonController {
    @RequestMapping(value = "/index")
    public String welcome(){
        return "index";
    }
//    @RequestMapping(value = "/signup")
//    public String signUp(){
//
//    }
    @RequestMapping(value = "/signup",method = RequestMethod.GET)
    public String signUp(){
        return "signup";
    }
    @RequestMapping(value = "/signin",method = RequestMethod.GET)
    public String signIn(){
        return "signin";
    }
    @RequestMapping(value = "/signup",method = RequestMethod.POST)
    public ModelAndView checkSignUp(UserDao user){
        System.out.println("username : "+user.getName());
        System.out.println("password : "+user.getPassword());
        ModelAndView mav = new ModelAndView("show");
        mav.addObject("user",user);
        mav.addObject("name",user.getName());
        mav.addObject("message","hello world");
        return mav;
    }
    @RequestMapping(value = "signin",method = RequestMethod.POST)
    public void checkSignin(UserDao user){
        System.out.println("username : "+user.getName());
        System.out.println("password : "+user.getPassword());
        return ;
    }
}
