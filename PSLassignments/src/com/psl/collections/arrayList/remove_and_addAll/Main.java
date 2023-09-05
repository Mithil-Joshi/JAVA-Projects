package com.psl.collections.arrayList.remove_and_addAll;

import java.util.*;

public class Main{
    public static void main(String[] args){
		//Your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of User details to be added");
        int n = scanner.nextInt();
        scanner.nextLine();

        UserBO userList = new  UserBO();
        UserBO predefinedList =  UserBO.getList();

	  userList.addAll(predefinedList);

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter the user %d detail in csv format\n", i);
            String[] userDetails = scanner.nextLine().split(",");
            userList.add(new User(userDetails[0].trim(), userDetails[1].trim(), userDetails[2].trim(), userDetails[3].trim()));
        }

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
         for (User user : userList) {
            user.display();
        }

        System.out.println("Enter the range to be removed from array list");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        scanner.close();

        userList.removeUser(n1, n2);

        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Username", "Email");
        for (User user : userList) {
            user.display();
        }
	}
}

