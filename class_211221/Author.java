package class_211221;

import java.util.Scanner;

public class Author {
	
	String name;
	String author;
	
	
	public void show() {
		System.out.println("(" + name + "," + author + ")");
		
	}
	
	public Author(String name, String author) {
		this.name = name;
		this.author = author;
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		Author book [] = new Author[2];
		
		
		
		for (int i = 0; i < book.length; i++ ) {
			System.out.println("책 이름:");
			String name= sc.nextLine();
			System.out.println("책 저자:");
			String author = sc.nextLine();
			book [i] = new Author(name, author);
			
		}
		
		for (int i = 0; i < book.length; i++ ) {
			book[i].show();
		}
		
	
		
		sc.close();
	}


	
	

}
