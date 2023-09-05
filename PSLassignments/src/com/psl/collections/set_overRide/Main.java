package com.psl.collections.set_overRide;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create set of users
        Set<User> users = new HashSet<>();

        // take user input for number of users
        System.out.println("Enter number of users:");
        int n = sc.nextInt();
         sc.nextLine(); // consume newline character

        // take user input for each user and add to set
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter details of user" + i);
            System.out.println("Username:");
            String username = sc.nextLine();
            System.out.println("Bank name:");
            String bankname = sc.nextLine();
            User user = new User(username, bankname);
            users.add(user);
        }

        // create list of active users from CSV input
        System.out.println("Enter username(Expire in one month) seperated by comma");
        String[] activeUsernames = sc.next().split(",");
        List<User> activeUsers = new ArrayList<>();
        for (String username : activeUsernames) {
            User user = new User(username.trim(), null);
            activeUsers.add(user);
        }

        // remove inactive users from set using retainAll method
        users.retainAll(activeUsers);

        // sort users by username
        List<User> sortedUsers = new ArrayList<>(users);
        Collections.sort(sortedUsers);

        // print active users
        System.out.println("Users going to expire within a month");
        for (int i = 0; i < sortedUsers.size(); i++) {
            User user = sortedUsers.get(i);
            System.out.println("User " + (i+1));
            System.out.println("User Name = " + user.getUsername());
            System.out.println("Bank Name = " + user.getBankname());
        }

        sc.close();
    }
}