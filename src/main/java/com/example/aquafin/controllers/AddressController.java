package com.example.aquafin.controllers;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.aquafin.models.Address;
import com.example.aquafin.repositories.AddressRepository;

@Controller
public class AddressController {

    @Autowired
    private AddressRepository addressRepository;

    @GetMapping("/add-address")
    public String getAddAddress(Model model){
        Address address = new Address();
        model.addAttribute("address", address);
        return "add-address";
    }

    @PostMapping("/add-address")
    public String addAddress(@ModelAttribute Address address,Principal principal){

        String email = principal.getName();

        address.setEmail(email);

        addressRepository.save(address);

        return "redirect:dashboard"; 

    }


}
