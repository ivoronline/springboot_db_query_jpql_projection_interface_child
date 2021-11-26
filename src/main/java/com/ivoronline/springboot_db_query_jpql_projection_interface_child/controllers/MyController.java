package com.ivoronline.springboot_db_query_jpql_projection_interface_child.controllers;

import com.ivoronline.springboot_db_query_jpql_projection_interface_child.entities.AddressProjection;
import com.ivoronline.springboot_db_query_jpql_projection_interface_child.entities.PersonProjection;
import com.ivoronline.springboot_db_query_jpql_projection_interface_child.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @Autowired PersonRepository personRepository;

  //================================================================
  // RETURN PERSON PROJECTION
  //================================================================
  @RequestMapping("ReturnPersonProjection")
  AddressProjection returnPersonProjection() {
    PersonProjection  personProjection = personRepository.returnPersonProjection();
    AddressProjection addressProjection    = personProjection.getAddress();
    return addressProjection;
  }

}
