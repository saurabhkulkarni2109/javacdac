package com.app;

import java.io.IOException;
import java.io.*;
import com.app.entity.Student;
import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class App {
	
	public static void main(String[] args) throws StreamReadException, DatabindException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Student myStudent = mapper.readValue(new File("data/sample.json"), Student.class);
	}
}
