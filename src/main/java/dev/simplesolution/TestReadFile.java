package dev.simplesolution;

import java.io.InputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;
import org.springframework.util.FileCopyUtils;

@Component
public class TestReadFile implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(SpringBootClasspathresourceApplication.class);
	
	@Override
	public void run(String... args) throws Exception {
		// Read file from resources folder
		Resource resource = new ClassPathResource("data.json");
		InputStream inputStream = resource.getInputStream();
		byte[] fileData = FileCopyUtils.copyToByteArray(inputStream);
		String outputString = new String(fileData);
		
		logger.info("File content:");
		logger.info(outputString);
	}
	
}
