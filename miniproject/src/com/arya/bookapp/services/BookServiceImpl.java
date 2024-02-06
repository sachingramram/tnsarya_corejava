package com.arya.bookapp.services;

import java.util.Scanner;

import com.arya.bookapp.entities.Book;

public class BookServiceImpl implements BookService {
	Book[] books;
	Scanner scanner;
	
	public BookServiceImpl() {
		super();
		this.scanner=new Scanner(System.in);
		System.out.println("Enter size of Array:");
		books=new Book[scanner.nextInt()];
	}

	@Override
	public int printMenu() {
		// TODO Auto-generated method stub
		System.out.println("1. Insert Book Record");
		System.out.println("2. Update Book Record");
		System.out.println("3. Delete Book Record");
		System.out.println("4. Print Book Record");
		System.out.println("5. Print All Book Record");
		System.out.println("0. Exit Program");
		return scanner.nextInt();
	}

	@Override
	public void insertRecord(int index) {
		books[index]=new Book();
		// TODO Auto-generated method stub
		System.out.println("Enter Book Id:");
		books[index].setId(scanner.nextInt());
		scanner.nextLine();
		
		System.out.println("Enter Book Name:");
		books[index].setName(scanner.nextLine());
		
		System.out.println("Enter Book Price:");
		books[index].setPrice(scanner.nextFloat());
		
		
	}

	@Override
	public void deleteRecord(int id) {
		for(int i=0;i<books.length;i++) {
			int j=0;
			if(books[i].getId()==id)
				for( j=i;j<books.length-1;j++)
					books[j]=books[j+1];
			books[j]=null;
		}
		 
	}

	@Override
	public void updateRecord(int id) {
		for(int i=0;i<books.length;i++) {
			if(books[i].getId()==id) {
				System.out.println(books[i]);
				System.out.println("Enter Book name");
				books[i].setName(scanner.nextLine());
				System.out.println("Enter new Book Price: ");
				books[i].setPrice(scanner.nextFloat());
			}
		}
		
	}

	@Override
	public void printRecord(int id) {
		 for(Book book:books)
			 if(book.getId()==id)
				 System.out.println(book);
		
	}

	@Override
	public void printAllRecord() {
		 for(Book book:books)
				System.out.println(book);
				 
		
	}
	

}
