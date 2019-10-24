/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

public class Book{
	private String name;
	private static final double price = 50.0; /*constant*/
	private static int setNameCounter = 0;
	private static int objectCounter = 0;

	public Book(){ /*Constructor*/
		Book.objectCounter += 1;
	}
	public void setName(String name){
		this.name = name;
		Book.setNameCounter += 1;
	}
	protected static double getPrice(){
		return price;
	}
	static double getTotalPrice(){
		double totalPrice = Book.objectCounter * Book.price;
		return totalPrice;
	}
	protected void getName(){
		System.out.println(name);
	}
	protected static int howManySetName(){
		return setNameCounter;
	}
	static int howManyObject(){
		return objectCounter;
	}
}