package com.xiekongye.service;

import com.xiekongye.models.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by You on 2017/5/20.
 */
@Repository
public interface ITestService {

    String getInfo();

    List<Customer> getCustomers();
}
