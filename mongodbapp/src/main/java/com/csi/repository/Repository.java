package com.csi.repository;

import com.csi.dao.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Repository extends MongoRepository<Customer,Integer> {
    //
    //
}
