package com.psl.file_read_write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Mithil Joshi\\Downloads\\input.txt"));
	FileWriter fr=new FileWriter("C:\\Users\\Mithil Joshi\\Downloads\\output.txt");
	List<Event> events=new ArrayList<>();
	
	EventBO e=new EventBO();
	events=e.readFromFile(br);
	e.writefile(events, fr);
	}

}
