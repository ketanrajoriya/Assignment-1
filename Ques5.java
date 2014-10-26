import java.util.*;

class Ques5
{
public static void main(String s[])
{
int i,j,temp;
System.out.print("enter the string : ");
Scanner scr=new Scanner(System.in);
String str = scr.nextLine(); 
char array[] = new char[str.length()];
int count[] = new int[255];
for(i=0;i<str.length();i++)
{
array[i]=str.charAt(i);
System.out.println("char "+array[i]);
}

for(i=0;i<str.length();i++)
{
for(j=i+1;j<str.length();j++)
{
if(array[i]==array[j])
{
System.out.println("ytytuy "+count[i]);

count[array[i]]++;
}

//count[array[i]]++;
}
}
for(i=0;i<26;i++)
{
System.out.println("char "+count[i]);
//count[array[i]]++;}
}
}}