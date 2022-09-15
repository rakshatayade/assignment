package test24july;

public class Book1 
{

	 public static void main(String[] args) 
	 {
	  BookInfo ob1 = new BookInfo("Herbert Schildt", "Complete Reference", "ABC Publication", 2359.50F, 10);
	  BookInfo ob2 = new BookInfo("Ulman", "system programming", "XYZ Publication", 359.50F, 20);
	  BookInfo ob3 = new BookInfo("Pressman", "Software Engg", "Pearson Publication", 879.50F, 15);
	  ob1.show();
	  ob2.show();
	  ob3.show();
	 }
	}


