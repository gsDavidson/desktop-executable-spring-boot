package com.gsdavidson.desktopSpringExecutable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;

@SpringBootApplication
public class DesktopSpringExecutableApplication {


	public static void main(String[] args) throws IOException {
		String fileSuccessText = "Successfully created this file at: " + new Date();

		BufferedWriter writer = new BufferedWriter(new FileWriter("RunnableJavaFile.txt"));
		writer.write(fileSuccessText);
		writer.close();
	}

}
