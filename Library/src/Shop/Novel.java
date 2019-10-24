package Shop;

import library.Book;

public class Novel extends Book{
	private static int novelCounter = 0;

	public Novel(){
		super();
		Novel.novelCounter += 1;
	}
	public static int howManyNovel(){
		return novelCounter;
	}
}