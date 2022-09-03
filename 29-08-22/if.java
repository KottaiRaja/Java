@import java.util.Scanner;
public class ifExample{
public static void main(String[] args){
int age;
System.out.println("Enter your age");
Scanner age = new Scanner(System.in);
int value = age.nextInt(); 

if(age>18){
System.out.println("You are eligible to vote");
}
}
}