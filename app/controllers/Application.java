package controllers;

import play.*;
import play.mvc.*;
import play.db.jpa.*;
import views.html.*;
import models.Customer;
import java.util.List;
import play.libs.Json;

public class Application extends Controller {

    public Result index() {
        List<Customer> customers = Customer.finder.all();
        return ok(index.render(customers));
    }

    public Result getAllCustomers() {
        List<Customer> customers = Customer.finder.all();
        return ok(Json.toJson(customers));
    }
}
