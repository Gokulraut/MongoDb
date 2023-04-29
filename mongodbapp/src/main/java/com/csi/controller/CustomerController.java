package com.csi.controller;

import com.csi.dao.Customer;


import com.csi.exception.RecordNotFoundException;
import com.csi.service.EmployeeServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
@Slf4j
public class CustomerController {

    @Autowired
    EmployeeServiceImpl customerService;

    @PostMapping("/savedata")
    public ResponseEntity<Customer>saveData(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.saveData(customer));
    }
    @GetMapping("/getAllData")
    public ResponseEntity<List<Customer>>getAllData(){
        return ResponseEntity.ok(customerService.getAllData());
    }

    @GetMapping("/getDataById/{custId}")
    public ResponseEntity<Optional<Customer>> getDataById(@PathVariable int custId){
        return ResponseEntity.ok(customerService.getDatabyId(custId));


    }
    @PutMapping("/updateData/{custId}")
    public ResponseEntity<Customer>updateDate(@PathVariable int custId,@RequestBody Customer customer) throws RecordNotFoundException {

        Customer customer1=customerService.getDatabyId(custId).orElseThrow(()->new RecordNotFoundException("id Dose Not Exist"));

        customer1.setCustName(customer.getCustName());
        customer1.setCustAddress(customer.getCustAddress());
        customer1.setAccountBal(customer.getAccountBal());
        customer1.setCustContact(customer.getCustContact());
        customer1.setCustDob(customer.getCustDob());
        return ResponseEntity.ok(customerService.updateDta(customer1));
    }
    @DeleteMapping("/deleteDataById/{custId}")
    public ResponseEntity<String >deleteDataById(@PathVariable int custId){
        customerService.deleteDataById(custId);
        return ResponseEntity.ok("Id deleted Successfully");
    }

    @GetMapping("say")
    public ResponseEntity<String>send(){
        return ResponseEntity.ok("dwgdyuwyudwy");
    }
}
