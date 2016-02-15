package hubs;

import hubs.controllers.*;

public class Controllers {
	private Builder builder;
	
	public Controllers(Builder builder) {
		this.builder = builder;
	}
	
	public void register() {
		(new WelcomeController(builder)).register();
	}
}
