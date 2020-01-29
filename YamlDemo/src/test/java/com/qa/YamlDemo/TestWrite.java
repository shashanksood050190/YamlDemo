package com.qa.YamlDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.yaml.snakeyaml.Yaml;

import write.Student;

public class TestWrite {

	public static Student createStudent() {
		Student student = new Student();
		student.setLearn("learning yaml");
		student.setAge(30);
		student.setInovation("ye sthey do");
		student.setSmile("yes they do");
		student.setBestCreature(true);
		return student;

	}

	public static void main(String[] args)  {

		Student student = createStudent();
		Yaml yaml = new Yaml();
		String dataFile="\\src\\main\\java\\write\\student.yaml";
		String strFile=System.getProperty("user.dir")+dataFile;
		try {
			yaml.dump(student,new FileWriter(new File(strFile)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("done");
	}

}
