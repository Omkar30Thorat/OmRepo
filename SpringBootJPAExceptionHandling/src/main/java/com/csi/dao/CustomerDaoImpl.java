package com.csi.dao;

import com.csi.model.Customer;
import com.csi.repo.CustomerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    CustomerRespository customerRespositoryImpl;

    public Customer saveData(Customer customer){
        return customerRespositoryImpl.save(customer);
    }

    public Optional<Customer> getDataById(int custId){
        return customerRespositoryImpl.findById(custId);
    }

    public List<Customer> getAllData(){
        return customerRespositoryImpl.findAll();
    }

    public Customer updateData(Customer customer){
        return customerRespositoryImpl.save(customer);
    }

    public void deleteDataById(int custId){
       customerRespositoryImpl.deleteById(custId);
    }
}
