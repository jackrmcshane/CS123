/**
  Jack McShane
  CS 123 Homework 2
  Roger Kraft
*/

public class Hw2{
  public static void main( String[] args ){
    twoLines();
    fiveStar();
    System.out.println();
    //System.out.println();
    twoLines();
    fiveStar();
    twoLines();
    System.out.println();
    //System.out.println();
    twoLines();
    vertical();
    twoLines();
    fiveStar();
    vertical();
  }

  public static void twoLines(){
    for( int i = 0; i < 2; i++ ){
      System.out.println( "*****" );
    }
  }

  public static void fiveStar(){
    System.out.println( " * *" );
    System.out.println( "  *" );
    System.out.println( " * *" );
  }

  public static void vertical(){
    for( int i = 0; i < 3; i++ ){
      System.out.println( "  *" );
    }
  }
}
