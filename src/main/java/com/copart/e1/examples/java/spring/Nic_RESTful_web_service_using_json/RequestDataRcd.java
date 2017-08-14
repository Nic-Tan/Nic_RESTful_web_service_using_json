package com.copart.e1.examples.java.spring.Nic_RESTful_web_service_using_json;

/** 
 * A POJO that holds the data from the http request
 **/
 
 public class RequestDataRcd
 {
      String firstName;
      String lastName;
      
      public String getFirstName() 
      { return firstName; }
      
      public void setFirstName(String firstName) 
      { this.firstName = firstName; }
      
      public String getLastName() 
      { return lastName; }
      
      public void setLastName(String lastName)
      { this.lastName = lastName; }
      
      @Override
      public String toString()
      { return "PostBody [firstName=" + firstName + ", lastName=" + lastName + "]"; }
}
