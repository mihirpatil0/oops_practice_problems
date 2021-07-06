package com.bridgelab.deckofcards;

/******************************************************
 * @author mihir
 *	
 * This class is a main class from here
 * we will call the methods we are using in the program.
 ******************************************************/

public class DeckOfCardsMain
{
	public static void main(String[] args)
	{
		DeckOfCards deckOfCardsObject = new DeckOfCards();
		deckOfCardsObject.deckInitialize();
		deckOfCardsObject.shuffle();
		deckOfCardsObject.PrintDistribute();
	}
}
