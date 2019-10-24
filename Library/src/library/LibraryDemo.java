package library;

import java.util.Scanner;
import Shop.Novel;

public class LibraryDemo{
	public static void main(String[] args) {
		Book book1 = new Book();
            try (Scanner input = new Scanner(System.in)) {
                System.out.println("Set a new game for novel :");
                String name = input.nextLine();
                book1.setName(name);
            }

		Novel novel1 = new Novel();

		novel1.setName("Goosebumps");

		System.out.println(Book.getTotalPrice());
		System.out.println(Book.howManyObject());
	}
}
