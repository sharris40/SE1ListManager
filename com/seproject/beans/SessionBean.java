/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Spencer
 */
@Named
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 1L;
    @Inject
    UserBean userBean;
    @Inject
    InterfaceBean interfaceBean;

    public void logIn(char[] pass) {
        userBean.setPassword(pass);
        if (userBean.logIn()) {
            navigate();
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, null, "Invalid user name or password."));
        }
    }

    public void logOut() {
        userBean.setPassword(null);
        userBean.logOut();
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("index.xhtml");
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void navigate() {
        interfaceBean.setCurrentPage(interfaceBean.getRequestedPage());
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("faces/panel.xhtml");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
