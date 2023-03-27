package com.csi.service;

import com.csi.dao.Customer;
import com.csi.dao.CustomerDaoImpl;
import com.csi.repository.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl {

    @Autowired
    CustomerDaoImpl customerDaoImpl;

    public Customer saveData(Customer customer){
        return customerDaoImpl.saveData(customer);
    }

    public List<Customer> getAllData(){
        return customerDaoImpl.getAllData();
    }
    public Optional<Customer> getDatabyId(int empId){
        return customerDaoImpl.getDatabyId(empId);
    }
    public Customer updateDta(Customer customer){
        return customerDaoImpl.updateDta(customer);
    }
    public void deleteDataById(int custId){
        customerDaoImpl.deleteDataById(custId);
    }
}
