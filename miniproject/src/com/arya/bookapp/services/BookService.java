package com.arya.bookapp.services;

public interface BookService {
   
	int printMenu();
	
	void insertRecord(int index);
	
	void deleteRecord(int id);
	
	void updateRecord(int id);
	
	void printRecord(int id);
	
	void printAllRecord();
}
