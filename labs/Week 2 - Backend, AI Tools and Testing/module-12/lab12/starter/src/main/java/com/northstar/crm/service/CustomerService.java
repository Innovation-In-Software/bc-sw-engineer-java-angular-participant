package com.northstar.crm.service;

import com.northstar.crm.entity.Customer;
import com.northstar.crm.entity.CustomerStatus;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/** INTENTIONALLY MESSY — refactor in later steps. Do not submit this style. */
public class CustomerService {
    List data = new ArrayList();

    public Object doStuff(String a, String b, String c, String d, String e) {
        // a=id b=name c=email d=phone e=status-as-string
        if (a == null || a == "" || b == null || b == "") {
            System.out.println("bad");
            return null;
        }
        for (int i = 0; i < data.size(); i++) {
            Customer x = (Customer) data.get(i);
            if (x.getCustomerId().equals(a)) {
                System.out.println("dup");
                return null;
            }
        }
        Customer x = new Customer();
        x.setCustomerId(a);
        x.setFullName(b);
        x.setEmail(c);
        x.setPhone(d);
        if (e != null && e.equals("ACTIVE")) x.setStatus(CustomerStatus.ACTIVE);
        else if (e != null && e.equals("PROSPECT")) x.setStatus(CustomerStatus.PROSPECT);
        else if (e != null && e.equals("SUSPENDED")) x.setStatus(CustomerStatus.SUSPENDED);
        else if (e != null && e.equals("CLOSED")) x.setStatus(CustomerStatus.CLOSED);
        else x.setStatus(CustomerStatus.PROSPECT);
        x.setCreatedAt(LocalDateTime.now());
        data.add(x);
        System.out.println("ok " + a);
        if (b != null && b.contains("UPDATE")) {
            for (int i = 0; i < data.size(); i++) {
                Customer y = (Customer) data.get(i);
                if (y.getCustomerId().equals(a)) {
                    if (e != null && e.equals("ACTIVE")) y.setStatus(CustomerStatus.ACTIVE);
                    else if (e != null && e.equals("PROSPECT")) y.setStatus(CustomerStatus.PROSPECT);
                    System.out.println("upd");
                }
            }
        }
        return x;
    }

    public Object get(String id) {
        for (int i = 0; i < data.size(); i++) {
            Customer x = (Customer) data.get(i);
            if (x.getCustomerId() == id) { // BUG: == on strings
                return x;
            }
        }
        return null;
    }

    // TODO: replace doStuff/get with createCustomer / getCustomer / updateStatus
    // TODO: typed List<Customer>, proper exceptions, equals (not ==), correlation-aware logs
}
