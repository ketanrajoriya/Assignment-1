import java.util.*;

class Ques6
{
public static void main(String s[])
{
 int i,j,temp; 
System.out.print("enter the number of rows : ");
Scanner scr=new Scanner(System.in);
int rows = scr.nextInt();
System.out.print("enter the number of cols : ");
int cols = scr.nextInt();
int [][] array = new int[rows][cols];
int [][] array1 = new int[rows][cols];

for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.print("enter the row "+(i+1)+" col "+(j+1)+" element  : ");
array[i][j]= scr.nextInt();
}
}

for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.print(array[i][j]+"\t");
array1[i][j]=array[j][i];

}
System.out.print("\n");
}

System.out.println("After transpose ");
for(i=0;i<rows;i++)
{
for(j=0;j<cols;j++)
{
System.out.print(array1[i][j]+"\t");
}
System.out.print("\n");
}
}}
