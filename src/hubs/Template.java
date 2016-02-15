package hubs;

import java.io.StringWriter;
import java.io.Writer;

import com.mitchellbosecke.pebble.PebbleEngine;

public class Template {
	private PebbleEngine engine;
	
	public Template() {
		engine = new PebbleEngine.Builder().build();
	}
	
	public void render(String template, Writer writer){
		try{
			engine.getTemplate(template).evaluate(writer);
		}catch(Exception e){
			throw new IllegalArgumentException(e.getMessage());
		}
	}
	
	public String render(String template)
	{
		StringWriter st = new StringWriter();
		render(template, st);
		return st.toString();
	}
}
