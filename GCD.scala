// Assignment 13.1 
// Below program illustrates the Scala Program to Calculate the GCD /HCF for two integers
// package declaration
// @author Chhaya Yadav
// Compiled on 10th Nov 2017

package scalapackage

//importing the Scanner class to take user input

import java.util.Scanner


object GCD {

//method declaration to calculate the HCF
  
def calcgcd( a : Int , b : Int): Unit = {
  
  var i = 1;

  var gcd = 1;

//
  
  while((a>=i) && (i<=b)) {
    
//if the number divides both the user input ,then save it as GCD   
    
   if((a%i==0) && (b%i==0)) {
   
     gcd = i;
    
    }

    i  = i + 1;
   }
//display the GCD/HCF 
  
   println( gcd + " is the GCD/HCF of " + a + " & " + b +".");
 
}

//main method declaration

def main(args : Array[String])  {

   println("---This SCALA program will calculate the GCD of two integers----");

   
   println("Please input the first number /integer");
   
//Accepting first Integer as user input
   
   var num1 = readInt();

   println("Please input the second  number /integer");

//Accepting second integer as user input
   
   var num2 = readInt();

//passing the arguments to a function in sorted ascending order to calculate GCD/HCF
   
   if( num1 < num2 ){  
       calcgcd(num1,num2);
   }
   else{
       calcgcd(num2,num1);
   }

}



}
