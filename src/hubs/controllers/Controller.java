package hubs.controllers;

import hubs.Builder;

public abstract class Controller {
	protected Builder builder;
	
	Controller(Builder builder) {
		this.builder = builder;
	}
}
