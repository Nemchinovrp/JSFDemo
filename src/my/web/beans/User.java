package my.web.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by User on 20.03.2015.
 */
@ManagedBean(name = "user2")
@SessionScoped
public class User {
    private String username;

    public User(){

    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
