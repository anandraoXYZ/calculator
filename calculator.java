import java.util.Scanner;
class Sw
{
public static void main(String args[])
{
char choice;
int a,b;
do{
System.out.println("enter your choice \n");
System.out.println("+. ADDITION \n-.SUBSTRACTION \n*. MULTIPLICATION \n/. DIVISION \nm.
exit");
Scanner sc=new Scanner(System.in);
choice=sc.next().charAt(0);
switch(choice)
{
case '+':
{
System.out.println("enter two numbers \n");
a=sc.nextInt();
b=sc.nextInt();
int c=a+b;
System.out.println(c);
break;
}
case '-':
{
System.out.println("enter two numbers \n");
a=sc.nextInt();
b=sc.nextInt();
int d=a-b;
System.out.println(d);
break;
}
case '*':
{
System.out.println("enter two numbers \n");
a=sc.nextInt();
b=sc.nextInt();
int e=a*b;
System.out.println(e);
break;
}
case '/':
{
System.out.println("enter two numbers \n");
a=sc.nextInt();
b=sc.nextInt();
float F=a/b;
System.out.println(F);
break;
}
}
}while(choice!='m');
}
}