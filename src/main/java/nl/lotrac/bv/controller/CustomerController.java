package nl.lotrac.bv.controller;

import nl.lotrac.bv.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", maxAge=3600)
@RestController
@RequestMapping(value = "/customers")

public class CustomerController {

    @Autowired
    private CustomerService customerService;

//    @GetMapping(value = "")
//    public ResponseEntity<Object> getMessage() {
//        return new ResponseEntity<>("SECURED REST endpoint: /customers", HttpStatus.OK);
//    }

    @GetMapping(value = "")

    public ResponseEntity<Object>getCustomers(){

        return ResponseEntity.ok().body(customerService.getCustomers());


    }

}
