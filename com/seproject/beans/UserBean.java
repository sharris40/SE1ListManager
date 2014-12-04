/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import com.seproject.Database.DatabaseConnection;
import com.seproject.mainFacade.Administrator;
import com.seproject.mainFacade.Chair;
import com.seproject.mainFacade.User;
import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author Spencer
 */
@Named
@SessionScoped
public class UserBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private User user = null;
    private String name = null;
    private char[] pass = null;

    public String getUserName() {
        return name;
    }

    public void setUserName(String name) {
        this.name = name;
        this.user = DatabaseConnection.getInstance().getUserByName(name);
    }

    public int getUserID() {
        if (user != null) {
            return user.getUserID();
        }
        return -1;
    }

    public void setPassword(char[] pass) {
        if (pass != null) {
            this.pass = new char[pass.length];
            for (int i = 0; i < pass.length; ++i) {
                this.pass[i] = pass[i];
                pass[i] = '\0';
            }
        } else {
            this.pass = null;
        }
    }

    private boolean isReady() {
        return user != null && name != null && !name.isEmpty() && pass != null && pass.length > 0;
    }

    public boolean isLoggedIn() {
        return user != null && user.getUserID() > -1;
    }

    public boolean isAdmin() {
        return isLoggedIn() && user instanceof Administrator;
    }

    public boolean isChair() {
        return isLoggedIn() && user instanceof Chair;
    }

    /**
     *
     * @return
     */
    public boolean logIn() {
        if (isLoggedIn()) {
            return true;
        }
        if (isReady()) {
            boolean result = user.logIn(name, pass);
            pass = null;
            return result;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public boolean logOut() {
        if (user != null) {
            return user.logOut();
        }
        return true;
    }

    /**
     *
     * @param pass
     * @return
     */
    public boolean changePassword(char[] pass) {
        if (isLoggedIn() && isReady()) {
            if (user.logIn(name, this.pass)) {
                this.pass = null;
                return user.changePassword(pass);
            }
        }
        return false;
    }
}
