class Ques8
{
public static void main(String s[])
{
int i=0,j,k;
int [] array1= {1,7,8,11,17,0,0,0,0,0};
int [] array2={1,2,3,18,23};
while(array1[i]!=0)
{
i++;
}
int temp=i;
j=0;
for(i=temp;i<array1.length;i++)
{
array1[i]=array2[j];
j++;}
for(i=0;i<array1.length;i++)
{
for(j=(i+1);j<array1.length;j++)
{
if(array1[i]>array1[j])
{
temp=array1[i];
array1[i]=array1[j];
array1[j]=temp;
}
}
}
System.out.println("sorted array");
for(i=0;i<array1.length;i++)
{
System.out.println("element :"+array1[i]);
}
}
}


