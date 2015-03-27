package my.web.controller;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 * Created by User on 20.03.2015.
 */
@ManagedBean
@RequestScoped
public class LoginController {


    public LoginController(){

    }
    public String login(){
        return "books";
    }
}
