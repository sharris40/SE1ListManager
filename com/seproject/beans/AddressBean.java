/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.seproject.beans;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import org.primefaces.model.SelectableDataModel;
import com.seproject.Database.DatabaseConnection;

/**
 *
 * @author Spencer
 */
@ManagedBean(name = "addressList")
@ViewScoped
public class AddressBean {

    private ArrayList<String> cachedAddresses;
    private boolean more;

    @PostConstruct
    public void init() {
        load();
    }

    public List<String> getLoadedAddresses() {
        return cachedAddresses;
    }

    public void load() {
        if (cachedAddresses == null) {
            cachedAddresses = new ArrayList<>();
        }
        more = DatabaseConnection.getInstance().getEmailAddresses(null, cachedAddresses);
    }

    public boolean hasMore() {
        return more;
    }
}
