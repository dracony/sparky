package hubs;

public class Builder {
	private Controllers controllers;
	private Template template;
	
	public Controllers controllers() {
		if(controllers == null)
			controllers = new Controllers(this);
		return controllers;
	}
	
	public Template template() {
		if(template == null)
			template = new Template();
		return template;
	}
}
