package controllers;

import play.*;
import play.mvc.*;
import views.html.*;
import java.util.List;


import models.Customer;
import play.libs.Json;
import com.fasterxml.jackson.databind.JsonNode;

import play.libs.Json;

public class CustomerController extends Controller {

    public Result index() {
    	List<Customer> customers = Customer.finder.all();
        return ok(addcustomer.render(customers));
    }

    public Result saveCustomer() {
    	JsonNode jsonNode = request().body().asJson();
    	Customer customer = Json.fromJson(jsonNode, Customer.class);
        if(customer.id == null) {
            customer.save();
        } else {
            customer.update();
        }
    	return ok(Json.toJson(customer));
    }

    public Result deleteCustomer() {
        JsonNode jsonNode = request().body().asJson();
        Customer customer = Json.fromJson(jsonNode, Customer.class);
        customer.delete();
        return ok(Json.toJson(customer));
    }

}