import java.util.Scanner;
public class Nestedif{
public static void main(String[] args){
System.out.print("Enter your age");
Scanner a = new Scanner(System.in);
int age = a.nextInt();
System.out.print("Enter your weight");
Scanner b = new Scanner(System.in);
int weight = b.nextInt();
if (age>=18){
if (weight>50){
System.out.println("you are eligible to donate blood");
}else{
System.out.println("you are not eligible to donate blood");
}
}
}
} 



