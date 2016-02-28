package org.sonatype.mavenbook.weather;

import org.apache.log4j.PropertyConfigurator;
import org.sonatype.mavenbook.weather.model.TestResponseBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {

	private TestService testService;

	
	public static void main(String[] args) throws Exception {
		// Configure Log4J
		PropertyConfigurator.configure(Main.class.getClassLoader().getResource(
				"log4j.properties"));


		// Start the program
		Main main = new Main("test");

		ApplicationContext context = 
			new ClassPathXmlApplicationContext(
					new String[] { "classpath:applicationContext-weather.xml",
								   "classpath:applicationContext-persist.xml" });
		    main.testService = (TestService) context.getBean("testService");

			main.getWeather();

	}

	private String zip;

	public Main(String zip) {
		this.zip = zip;
	}

	public void getWeather() throws Exception {
		TestResponseBean response = testService.getResponse();
		System.out.print(response.getName());
	}


}
