/**
Course: CS 123
Name: Jack McShane
Assignment 2
*/

import java.util.*;

public class Ass2{
  public static void main( String[] args ){
    Scanner userInput = new Scanner( System.in );
    int numberInput;
    int size;
    int[] brokenInteger;

    System.out.print( "Enter and integer between 0 and 99999: " );
    numberInput = userInput.nextInt();

    if( !isValidInput( numberInput ) ){ System.out.print( "Fatal error. Number must be an integer between 0 and 99999." ); }
    else{
      size = sizeOf( numberInput );
      brokenInteger = new int[ size ];
      brokenInteger = separateNumber( numberInput, size );

      System.out.println( "The number you entered can be separated as such:" );
      for( int i = 0; i < size; i++ ){ System.out.print( " " + brokenInteger[ i ] ); }
    }

    System.out.println( "\nProgram terminated." );
  }

  public static int sizeOf( int numberInput ){
    if( numberInput < 10 ){ return 1; }
    else if( numberInput < 100 ){ return 2; }
    else if( numberInput < 1000 ){ return 3; }
    else if( numberInput < 10000 ){ return 4; }
    else{ return 5; }
  }

  public static int[] separateNumber(int numberInput, int size ){
    int[] separatedNumber = new int[ size ];

    for( int j = size - 1; j >= 0; j-- ){
      separatedNumber[ j ] = numberInput % 10;
      numberInput /= 10;
    }

    return separatedNumber;
  }

  public static boolean isValidInput( int numberInput){
    if( numberInput < 0 ){ return false; }
    else if( numberInput > 99999 ){ return false; }
    else{ return true; }
  }
}
