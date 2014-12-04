/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import com.seproject.emailClientMgmtCore.*;
import com.seproject.localMessageManager.ChairView;

import java.util.LinkedList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Spencer
 */
@ManagedBean(name = "templates")
@ViewScoped
public class TemplateBean {

    
    
    public List<EmailMessage> getMessages(ChairView view) {
        return new LinkedList<>();
    }

    public EmailMessage getCurrentMessage(ChairView view) {
    	return view.getCurrentMessage();
    }

    public void setCurrentMessage(ChairView view, EmailMessage message) {
        view.composeMessage(message.getTo(), message.getFrom(), message.getTitle(), message.getBody(), message.getName());
    }

    public void save(ChairView view) {
        if (currentMessage != null) {
           
        }
    }

}
