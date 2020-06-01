package week7.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import week7.service.UserService;
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public String root() throws JsonProcessingException {
        System.out.println("root");
        System.out.println(new ObjectMapper().writeValueAsString(userService.getUserList()));
        return "home";
    }


}
