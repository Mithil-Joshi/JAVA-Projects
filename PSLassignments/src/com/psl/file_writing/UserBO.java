package com.psl.file_writing;

import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class UserBO {
	
	public static void writeFile(ArrayList<User> userList, BufferedWriter bw) throws IOException {
		for (User user : userList) {
			bw.write(user.getName());
			bw.write(",");
			bw.write(user.getMobileNumber());
			bw.write(",");
			bw.write(user.getUsername());
			bw.write(",");
			bw.write(user.getPassword());
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
