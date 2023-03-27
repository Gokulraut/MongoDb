package com.csi.dao;


import com.csi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerDaoImpl {

    @Autowired
    Repository repository;

    public Customer saveData(Customer customer){
        return repository.save(customer);
    }

    public List<Customer>getAllData(){
        return repository.findAll();
    }
    public Optional<Customer> getDatabyId(int empId){
        return repository.findById(empId);
    }
    public Customer updateDta(Customer customer){
        return repository.save(customer);
    }
    public void deleteDataById(int custId){
        repository.deleteById(custId);
    }
}
