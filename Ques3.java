import java.util.*;

class Ques3
{
public static void main(String s[])
{
int i,j;
Scanner scr = new Scanner(System.in);
System.out.print( "How large do you want the array? " ); 
int total=scr.nextInt();
int[] theArray = new int[total];

for( i=0 ; i<theArray.length ; i++ ) 
{ 
System.out.print( "Enter value " + (i+1) + ": " ); 

theArray[i] = scr.nextInt(); 
}
System.out.print( "enter the number " );
int number = scr.nextInt();

System.out.println("Pairs are : ");

for(i=0;i<theArray.length;i++)
{
for(j=i+1;j<theArray.length;j++)
{
if((theArray[i]+theArray[j])==number)
{
System.out.println("("+theArray[i]+","+theArray[j]+")");
}
}
} 

}
}