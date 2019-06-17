/**
 * 
 */
package br.com.seuaquario.config;

import org.springframework.cloud.Cloud;
import org.springframework.cloud.CloudFactory;
import org.springframework.cloud.service.common.MongoServiceInfo;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.core.MongoTemplate;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

/**
 * @author Camila Nachbar - cshebling@stefanini.com - 62106 13 de jun de 2019
 */
public class MongoConfig extends AbstractMongoConfiguration {

	private Cloud getCloud() {
		CloudFactory cloudFactory = new CloudFactory();
		return cloudFactory.getCloud();
	}

	@Bean
	public MongoDbFactory mongoDbFactory() {
		Cloud cloud = getCloud();
		MongoServiceInfo serviceInfo = (MongoServiceInfo) cloud
				.getServiceInfo(cloud.getCloudProperties().getProperty("cloud.services.mongo.id"));
		String serviceID = serviceInfo.getId();
		return cloud.getServiceConnector(serviceID, MongoDbFactory.class, null);
	}

	protected String getDatabaseName() {
		Cloud cloud = getCloud();
		return cloud.getCloudProperties().getProperty("cloud.services.mongo.id");
	}

	public Mongo mongo() throws Exception {
		Cloud cloud = getCloud();
		return new MongoClient(cloud.getCloudProperties().getProperty("cloud.services.mongo.connection.host"));
	}

	@Bean
	public MongoTemplate mongoTemplate() {
		return new MongoTemplate(mongoDbFactory());
	}

	/* (non-Javadoc)
	 * @see org.springframework.data.mongodb.config.AbstractMongoConfiguration#mongoClient()
	 */
	@Override
	public MongoClient mongoClient() {
		// TODO Auto-generated method stub
		return null;
	}
}
