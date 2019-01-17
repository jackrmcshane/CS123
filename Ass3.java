/**
CS 123
Jack McShane
Assignment 3
*/

import java.util.*;

public class Ass3{
  public static void main( String[] args ){
    Scanner userInput = new Scanner( System.in );
    String[] substrings = new String[ 3 ];
    String stringInput, newString;
    int firstIndex, secondIndex, counter;

    System.out.println( "Enter a line of text without punctuation." );
    stringInput = userInput.nextLine();

    newString = stringInput.trim();
    firstIndex = newString.indexOf( ' ' );

    counter = firstIndex + 1;
    while( newString.charAt( counter ) == ' ' ){ counter ++; }

    secondIndex = newString.indexOf( ' ' , counter );

    substrings[ 1 ] = newString.substring( 0 , counter );
    substrings[ 0 ] = newString.substring( counter , secondIndex + 1 );
    substrings[ 2 ] = newString.substring( secondIndex + 1, newString.length() );

    System.out.println( "\nThe string you entered with the first two words switched is:" );
    for( int i = 0; i < 3; i++ ){ System.out.print( substrings[ i ] ); }
    System.out.println( "\n" );
  }
}
