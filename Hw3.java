/**
  Jack McShane
  CS 123 Homework 3
  Roger Kraft
*/

public class Hw3
{
   public static final int HEIGHT = 6;
   public static final int WIDTH = 3;

   public static void main(String[] args)
   {
     for( int row = 1; row <= HEIGHT; row++ ){
       for( int length = WIDTH; length > 0; length-- ){
         for( int i = row - 1; i > 0; i-- ){
           System.out.print( " " );
         }
         System.out.print( "\\" );
         for( int j = HEIGHT - row; j > 0; j-- ){
           System.out.print( " " );
         }
         System.out.print( "|" );
       }
       System.out.println();
     }
   }
}
