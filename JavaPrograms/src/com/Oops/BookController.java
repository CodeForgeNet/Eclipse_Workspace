package com.Oops;

import java.util.Scanner;

public class BookController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Title:- ");
		String title = sc.next();
		
		System.out.print("Enter Author:- ");
		String author = sc.next();
		
		System.out.print("Enter pages:- ");
		int numPages=sc.nextInt();
		
		
		Book bk = new Book(title, author, numPages);
		
		System.out.println(bk.getTitle() +","+bk.getAuthor()+","+bk.getNumPages());
		
//		------
		
		System.out.println("Enter new Title:- ");
		String newTitle=sc.next();
		
		bk.setTitle(newTitle);
		System.out.println(bk.getTitle() +","+bk.getAuthor()+","+bk.getNumPages());
		
		
		sc.close();
	}

}
