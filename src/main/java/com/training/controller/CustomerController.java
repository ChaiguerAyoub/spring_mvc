package com.training.controller;

import javax.jws.WebParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.training.core.Service;
import com.training.model.Customer;

@Controller
public class CustomerController {

    @Autowired
    private Service customerService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("add_customer")
    public String addCustomer(){
        return "add_customer";
    }

    @PostMapping("/add_customer")
    public String save(Customer customer){
        customerService.saveCustomer(customer);
        return "redirect:/customers";
    }

    @PostMapping("/find_by_id")
    public ModelAndView findById(@RequestParam String id){
        ModelAndView mv = new ModelAndView("edit_customer");
        int customerId = Integer.parseInt(id);
        Customer customer = customerService.customers().get(customerId - 1);

        mv.addObject("customer",customer);
        mv.addObject("id",customerService.customers().indexOf(customer) + 1);

        return  mv;
    }

    @PostMapping("/edit_customer/{id}")
    public ModelAndView updateCustomer(@PathVariable int id, Customer customer){
        ModelAndView mv = new ModelAndView("home");
        customerService.updateCustomer(customer,--id);
        return mv;
    }

    @GetMapping("/find_by_id")
    public String findById(){
        return "get_by_id";
    }
}
