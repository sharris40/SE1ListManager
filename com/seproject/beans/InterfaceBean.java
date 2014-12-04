/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import java.io.Serializable;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Spencer
 */
@Named
@SessionScoped
public class InterfaceBean implements Serializable {

    @Inject
    UserBean user;

    private static final long serialVersionUID = 1L;

    public enum Page {

        OVERVIEW,
        SCHEDULE,
        ANNOUNCEMENTS,
        LIST,
        ADMIN,
        SETTINGS,
        FORBIDDEN
    };
    private Page currentPage = Page.FORBIDDEN;
    private Page requestedPage = Page.OVERVIEW;

    public Page getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Page page) {
        setRequestedPage(page);
        if (!user.isLoggedIn()
                || page == Page.ANNOUNCEMENTS && !user.isChair()
                || page == Page.ADMIN && !user.isAdmin()) {
            this.currentPage = Page.FORBIDDEN;
        } else {
            this.currentPage = page;
        }
    }

    public Page getRequestedPage() {
        return requestedPage;
    }

    public void setRequestedPage(Page page) {
        this.requestedPage = page;
    }

    public String getCurrentPageName() {
        return currentPage.name().toLowerCase();
    }

    public int getCurrentIndex() {
        if (user.isLoggedIn()) {
            switch (currentPage) {
                case OVERVIEW:
                    return 0;
                case SCHEDULE:
                    return 1;
                case ANNOUNCEMENTS:
                    return 2;
                case LIST:
                    if (user.isChair()) {
                        return 3;
                    } else {
                        return 2;
                    }
                case ADMIN:
                    if (user.isChair()) {
                        return 4;
                    } else {
                        return 3;
                    }
                case SETTINGS:
                    if (user.isChair()) {
                        if (user.isAdmin()) {
                            return 5;
                        } else {
                            return 4;
                        }
                    } else if (user.isAdmin()) {
                        return 4;
                    } else {
                        return 3;
                    }
                default:
                    return -1;
            }
        } else {
            return -1;
        }
    }
}
