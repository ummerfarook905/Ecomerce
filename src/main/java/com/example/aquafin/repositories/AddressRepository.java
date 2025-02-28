package com.example.aquafin.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.aquafin.models.Address;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long>{

}
