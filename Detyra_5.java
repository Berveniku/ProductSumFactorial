public class Detyra_5
{
//Shuma (SIGMA) prej c=1 deri ne k
   public int shuma(int k)
   { 
      int total = 0;
      int counter = 0; 
               while ( counter != k )
      
               { counter = counter + 1;
         total = total +counter;
         System.out.print(" "+counter);
         if (counter!=k)
         {System.out.print(" +");}}
      System.out.println(" = "+total);
   
   
      return total;}
      
//Prodhimi (PI) prej a deri ne b
   public int prodhimi(int x, int y)
   { int totali = 1;
      
      if ( x <= y )
      {
      int counter = x-1;
         while ( counter != y )
         {counter = counter + 1;
                  totali = totali * counter;
        
         System.out.print(" "+counter);
         
         if(counter != y)
         {System.out.print(" x");}}
         System.out.println(" = "+totali);        
       }
       else {System.out.println("Pasi qe y<x pergjigjja eshte ="+totali);}
   
   
      return totali;
   }
   
   // Faktorieli i n
   public long factoriel(int n)
{ long fact = 1; 
if ( n >= 0)
{ int counter = 0; 
int f = 1;
System.out.print(" "+n+"! =>");
while ( counter != n )

{ counter = counter + 1;
fact = fact * counter;
System.out.print(" "+counter);
if(counter != n)
{System.out.print(" x");}}
System.out.println(" = "+fact);
}
else {System.out.println("Pasi qe numri i dhene nga ju eshte <0 ateher faktorieli = -1");}
return fact;
}
    //Sinusi
public double sinusoide(double sinuse)
{ sinuse = Math.toRadians(sinuse);
System.out.println("Sinusi i kendit te dhene eshte "+Math.sin(sinuse));
return sinuse;} 
   //Kosinusi
public double cosinusoide(double cosinuse)
{ cosinuse = Math.toRadians(cosinuse);
System.out.println("Kosinusi i kendit te dhene eshte "+Math.cos(cosinuse));
return cosinuse;} }
