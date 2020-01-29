package com.qa.YamlDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.yaml.snakeyaml.Yaml;

import read.Placeholder;

public class TestPlaceHolder {
	
	public static void main(String args[])
	{
		String yamlPath=".\\src\\main\\java\\read\\child.yaml";
		
		Yaml yaml=new Yaml();
		Placeholder placeholder=null;
		try {
			placeholder=yaml.loadAs(new FileInputStream(new File(yamlPath)), Placeholder.class);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(placeholder);
	}
}
