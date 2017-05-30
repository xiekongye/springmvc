package com.xiekongye.service;

import com.xiekongye.models.Customer;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by You on 2017/5/20.
 */
@Service
public interface ITestService {

    String getInfo();

    List<Customer> getCustomers();
}
