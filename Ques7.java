import java.util.*;

class Ques7
{
public static void main(String s[])
{
int i,j,n=0,m=0,min1=0,min2=0,diff;
Scanner scr = new Scanner(System.in);
System.out.print( "How large do you want the array? " ); 
int total=scr.nextInt();
int[] theArray = new int[total];
int[] firstArray = new int[total];
int[] secondArray = new int[total];
int[] difference = new int[total];

for( i=0 ; i<theArray.length ; i++ ) 
{ 
System.out.print( "Enter value " + (i+1) + ": " ); 

theArray[i] = scr.nextInt(); 
}

System.out.print( "enter the first number" ); 
int first = scr.nextInt(); 

System.out.print( "enter the second number" ); 
int second = scr.nextInt(); 

for(i=0;i<theArray.length;i++)
{
if(first==theArray[i])
{
firstArray[n]=i+1;
n++;
}

if(second==theArray[i])
{
secondArray[m]=i+1;
m++;
}
}

for(i=0;i<firstArray.length;i++)
{
//System.out.println( "first"+firstArray[i] ); 
//System.out.println( "second"+secondArray[i] ); 

}
for(i=0;i<theArray.length;i++)
{
for(j=0;j<theArray.length;j++)
{

//System.out.println( "first"+firstArray[i] ); 
//System.out.println( "second"+secondArray[i] ); 
if(firstArray[i]!=0 && secondArray[j]!=0)
{
if(secondArray[j]>firstArray[i])
{
diff = secondArray[j]-firstArray[i];
difference[n]=diff;
n++;}
else 
{
diff = firstArray[i]-secondArray[j];
difference[n]=diff;
n++;}
}
}
}

for(i=0;i<difference.length;i++)
{
for(j=0;j<difference.length;j++)
{
if(difference[i]!=0)
{
if(difference[j]>difference[i])
{
min1=difference[i];

}
}
//System.out.println( "differece"+difference[i] ); 
//System.out.println( "min differece"+min1 ); 
}
}


System.out.println( "min differece"+min1 ); 
}
}