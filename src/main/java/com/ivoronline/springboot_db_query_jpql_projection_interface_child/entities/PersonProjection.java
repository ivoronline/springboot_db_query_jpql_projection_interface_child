package com.ivoronline.springboot_db_query_jpql_projection_interface_child.entities;

public interface PersonProjection {
  String      getName();
  String      getAge();
  AddressProjection getAddress();
}



