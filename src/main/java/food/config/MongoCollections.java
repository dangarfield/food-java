package food.config;

import java.util.logging.Logger;

import org.jongo.Jongo;
import org.jongo.MongoCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MongoCollections {
	
	private static final Logger LOG = Logger.getLogger("MongoCollections");

	@Autowired
	private Jongo jongo;

	@Bean
	public MongoCollection recipes() {
		LOG.info("Bean created: recipes");
		return jongo.getCollection("recipes");
	}

	@Bean
	public MongoCollection users() {
		LOG.info("Bean created: users");
		return jongo.getCollection("users");
	}

	@Bean
	public MongoCollection ingredients() {
		LOG.info("Bean created: ingredients");
		return jongo.getCollection("ingredients");
	}
	
	
	

	@Bean
	public MongoCollection config() {
		LOG.info("Bean created: config");
		return jongo.getCollection("config");
	}
}
