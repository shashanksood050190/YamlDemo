package com.qa.YamlDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

public class BasicTests {

	// Example 1: Yaml string to Java Map
	// @Test
	public void stringToMap() {
		Yaml yaml = new Yaml();
		String str = "hello : 25";
		Map<String, Integer> map = yaml.load(str);
		Integer value = map.get("hello");
		System.out.println(value);
	}

	// Example 2: Multiple string lines to Java Map
	//@Test
	public void multiplestringLinesToMap() {
		Yaml yaml = new Yaml();
		String str = "name : shashank\n" + "phone: 111-111-1111\n" + "address: berri\n";
		Object object = yaml.load(str);

		// Object type as LinkedHashMap
		System.out.println(object.getClass());

		// convert object to map
		@SuppressWarnings("unchecked")
		Map<String, String> map = (Map<String, String>) object;

		System.out.println("Name: " + map.get("name"));
		System.out.println(map);

	}
	
	
	//Example 3: Yaml File to Map
	@Test
	public void yamlFileToMap() throws FileNotFoundException
	{
		Yaml yaml=new Yaml();
		String path=".\\src\\main\\java\\com\\qa\\YamlDemo\\basic.yaml";
		Map<String,String> map=yaml.load(new FileInputStream(new File(path)));
		System.out.println(map.get("name"));
		System.out.println(map);
		
	}

}
