package hubs.controllers;

import static spark.Spark.*;
import hubs.Builder;
import spark.*;

public class WelcomeController extends Controller {
	
	public WelcomeController(Builder builder) {
		super(builder);
	}

	public Object index(Request request, Response response) {
		return builder.template().render("views/welcome.peb");
	}
	
	public void register() {
		get("/", this::index);
	}
}
