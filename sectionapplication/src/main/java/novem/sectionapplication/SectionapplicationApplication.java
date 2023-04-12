package novem.sectionapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.core.metrics.ApplicationStartup;
import org.springframework.core.metrics.StartupStep;

import javax.swing.*;

@SpringBootApplication
public class SectionapplicationApplication {

	public static void main(String[] args) {
		 SpringApplication.run(SectionapplicationApplication.class, args);
	}

}
