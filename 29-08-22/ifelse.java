import java.util.Scanner;
public class ifelse{
public static void main(String[] args){
System.out.print("Enter your mark ");
Scanner a = new Scanner(System.in);
int mark = a.nextInt();


if(mark<50){
System.out.println("Fail");
}else if(mark>=50 && mark<65)
{
System.out.println("C Grade");
}else if(mark>=75 && mark<85){
System.out.println("B Grade");
}else if(mark>=85 && mark<95){
System.out.println("B+ Grade");
}else if(mark>=95 && mark<100){
System.out.println("A Grade");
}else if(mark==100){
System.out.println("O Grade");
}else{
System.out.println("invaild!");
}
}
}
