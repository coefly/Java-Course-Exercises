package com.course.misc;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;



public class Snippet {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter domain:");
		String domain = sc.nextLine();
		
	    InetAddress inet = InetAddress.getByName(domain);
	
	    System.out.println("Sending Ping Request to " + domain);
	    System.out.println("IP is " + inet.getHostAddress());
	    
	    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
	
	   
	}
}