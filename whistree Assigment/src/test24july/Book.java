package test24july;

public class Book {

	 String author, title, publisher;
	 Book(String a, String t, String p)
	 {
	  author = a;
	  title = t;
	  publisher = p;
	 }
	}
	class BookInfo extends Book
	{
	 float price;
	 int stock_position;
	 BookInfo(String a, String t, String p, float amt, int s)
	 {
	  super(a, t, p);
	  price = amt;
	  stock_position = s;
	 }
	 void show()
	 {
	  System.out.println("Book Details:");
	  System.out.println("Title: " + title);
	  System.out.println("Author: " + author);
	  System.out.println("Publisher: " + publisher);
	  System.out.println("Price: " + price);
	  System.out.println("Stock Available: " + stock_position);
	 }
	}
	

