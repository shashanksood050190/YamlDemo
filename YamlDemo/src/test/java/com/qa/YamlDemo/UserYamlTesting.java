package com.qa.YamlDemo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

// convert yaml file in java object using jackson
public class UserYamlTesting {

	public static void main(String[] args) {
		ObjectMapper objectMapper=new ObjectMapper(new YAMLFactory());
		objectMapper.enable(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY);
		User user=null;
		
		try {
			File file=new File(".\\src\\main\\java\\com\\qa\\YamlDemo\\read_user.yml");
			user=objectMapper.readValue(file, User.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		System.out.println(user.getName());
		System.out.println(user.getRoles());
		System.out.println(user.getAddress());
	
	}
	
}
