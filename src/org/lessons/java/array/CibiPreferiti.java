package org.lessons.java.array;

public class CibiPreferiti {

	public static void main(String[] args) {

		String[] myFavouriteFoods = {"Pasta e zucca", "Pizza", "Fagioli", "Salmone", "Sushi", "Salame", "Ananas" };
		int lenght = myFavouriteFoods.length;
		
		System.out.println("La lunghezza della classifica è: " + lenght);
		System.out.println("Al primo posto troviamo: " + myFavouriteFoods[0]);
		System.out.println("All'ultimo posto troviamo: " + myFavouriteFoods[lenght - 1]);
		System.out.println("In posizione mediana troviamo: " + myFavouriteFoods[lenght / 2]);
		
	}

}
