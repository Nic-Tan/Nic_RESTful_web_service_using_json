package com.copart.e1.examples.java.spring.Nic_RESTful_web_service_using_json;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * The role of a controller in spring is to handle 
 *  HttpServletRequests and HttpServletResponses
 *  http://docs.spring.io/spring/docs/current/javadoc-api/org/springframework/web/servlet/mvc/Controller.html
 *
 */
 @RestController
 /**
 * @RestController tells the spring framework to configure this class as a controller. And, it makes 
 * the use of the @ResponseBody annotation unnecessary.
 *
 */
 public class RestfulJsonServiceCtl
 {
 
 /**
  * 	  Requests to the specified URL will be mapped. or sent to, this method.
  *	    The @RequestMapping allows for a wide variety of configurations.
  *   	Some examples can be found here: http://www.baeldung.com/spring-requestmapping
  *	    And all of @RequestMapping's capabilities are listed here:
  *	    http://www.baeldung.com/spring-requestmapping	
  */
	      @RequestMapping("/")
        public String homeMapping()
        { return "You have reached the home url";}
  
        /*
         * POST vs GET: http://stackoverflow.com/questions/3477333/what-is-the-difference-between-post-and-get
         */
        @RequestMapping(value = "/post", method = RequestMethod.POST, produces = "application/json")
        public ResponseDataRcd onPost(@RequestBody RequestDataRcd requestBody)
        {
                System.out.println("Incoming data: " + requestBody.toString());
                
                // do something with the data in store the results in the response POJO
                ResponseDataRcd responseBody = new ResponseDataRcd();
                
                if(requestBody.firstName == null)
                {
                    responseBody.setFavoriteCar("Mercedes");
                    responseBody.setFavoriteColor("yellow");
                }
                else
                {
                    responseBody.setFavoriteCar("Porsche");
                    responseBody.setFavoriteColor("green");
                }
                
                System.out.println("Outgoing data: " + responseBody.toString());
                return responseBody;
        }
 }
