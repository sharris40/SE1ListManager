/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import com.seproject.emaildesigner.EmailMessageCommand;
import com.seproject.emaildesigner.SaveMessage;
import com.seproject.emailmanagement.EmailMessage;
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

    private EmailMessage currentMessage;

    public List<EmailMessage> getMessages() {
        return new LinkedList<>();
    }

    public EmailMessage getCurrentMessage() {
        return currentMessage;
    }

    public void setCurrentMessage(EmailMessage message) {
        currentMessage = message;
    }

    public void save() {
        if (currentMessage != null) {
            SaveMessage command = new SaveMessage();
            command.saveMessage(currentMessage);
            processCommand(command);
        }
    }

    public void processCommand(EmailMessageCommand command) {
        command.execute();
    }

}
