/**
Jack McShane
CS 123 Homework 4
Roger Kraft
*/

public class Hw4{
  public static void main( String[] args ){
    Scanner userInput = new Scanner( System.in );

    for( int i = 1; i <= 15; i++ ){
      System.out.println( "\nPlease enter a valid data of the form mm/dd/yyyy." );

      String dateString = userInput.next();
      checkDate( dateString );
    }
  }

  public static void checkDate( dateString ){
    String monthString;
    String dayString;
    String yearString;
    int month;
    int day;
    int year;
    boolean isLeapYear = false;

    firstIndex = IndexOf.dateString( '/' );
    secondIndex = IndexOf.dateString( '/' , firstIndex );

    monthString = substring( dateString, 0 , firstIndex );
    dayString = substring( dateString, firstIndex, secondIndex );
    yearString = substring( dateString, secondIndex, end );

    month = Integer.parseInt( monthString );
    day = Integer.parseInt( dayString );
    year = Integer.parseInt( yearString );

    //check month
    if( monthString.length() != 2 ){
      System.out.println( "Error with month. Must contain two digits." );
      return;
    }
    elseif( month < 1 || month > 12 ){
      System.out.println( "Error with month. Out of bounds." );
      return;
    }
    //check day
    elseif( dayString.length() != 2 ){
      System.out.println( "Error with day. Must contain two digits." );
      return;
    }
    elseif( )
    //check year
  }
}
