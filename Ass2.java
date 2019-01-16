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

    System.out.println( "Enter and integer between 0 and 99999: " );
    numberInput = userInput.nextInt();

    if( !isValidNumber( numberInput ) ){
      System.out.println( "Fatal error. Number must be an integer between 0 and 99999. Exiting program." );
      break;
    }else{
      size = sizeOf( input );
      brokenInteger = new int[ size ];
      brokenInteger = separateNumber( input, size );

      System.out.print( "The number you entered can be separated as such:" );
      for( int i = size; i >= 0; --i ){ System.out.print( " " + brokenInteger[ i ] ); }
    }
  }

  public static int sizeOf( int input ){
    if( input < 10 ){ retrun 1; }
    else if( )
  }

  public static int[] separateNumber(int input, int size ){

  }

  public static boolean isValidInput(){

  }
}
