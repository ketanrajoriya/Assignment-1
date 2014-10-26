import java.util.*;

class Ques4
{
public static void main(String s[])
{
int i,j,temp;
Scanner scr= new Scanner(System.in); 
//System.out.println("enter the size of array");
//int size = scr.nextInt();
int array1[] ={1,2,3,4,5,6,7,8,9};
int array2[] ={1,3,5,7,9,10,11,12,13};
j=0;
for(i=0;i<array1.length;i++)
{
for(j=0;j<array2.length;j++)

//while(array2[j] < array1[i])
{
if(array1[i]==array2[j])
{
System.out.println("element "+array1[i]);
}
//j++;
}

	}
}}