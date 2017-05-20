package com.xiekongye.service;

import com.xiekongye.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by You on 2017/5/20.
 */
@Repository
public class TestService implements ITestService {
    public String getInfo() {
        return "Service层输出";
    }

    public List<Customer> getCustomers() {
        List<Customer> customers = new ArrayList<Customer>();
        Customer customer1 = new Customer();
        customer1.setName("zhangjunyao");
        customer1.setName("23");
        customer1.setBirthday(new Date(1995,9,1));
        customers.add(customer1);

        return customers;
    }
}
