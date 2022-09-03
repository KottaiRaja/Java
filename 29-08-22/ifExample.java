import java.util.*;
public class ifExample{
public static void main(String[] args){
System.out.print("Enter your age ");
Scanner a = new Scanner(System.in);
int age = a.nextInt(); 

if(age>18){
System.out.println("You are eligible to vote");
}else{
System.out.println("You are not eligible to vote");
}
}
}