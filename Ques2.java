import java.util.*;
class Ques2
{
public static void main(String s[])
{
int i=0,j=0,temp,last=0;

Scanner scr = new Scanner(System.in);

System.out.print( "How large do you want the array? " ); 

int[] theArray = new int[scr.nextInt()];

for( i=0 ; i<theArray.length ; i++ ) 
{ 
System.out.print( "Enter value " + (i+1) + ": " ); 
theArray[i] = scr.nextInt(); 
} 

last = theArray.length;
int[] theArray2 = new int[last];
j=0;
for(i=theArray.length-1;i>=0;i--)
{
theArray2[j]=theArray[i];
j++;
}
for(i=0;i<theArray.length;i++)
{
theArray[i]=theArray2[i];
}

System.out.println("your reversed array = " );
for(  i=0 ; i<theArray.length ; i++ ) 
{ System.out.print(theArray[i]);
}
}
}