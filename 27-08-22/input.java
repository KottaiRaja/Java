import java.util.*;
class input{
public static void main(String[] args){
System.out.println("Add");
System.out.print("Enter the first value: ");
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();

System.out.print("Enter the second value: ");
Scanner sd=new Scanner(System.in);
int b = sd.nextInt();

int c = a+b;

System.out.println("The final result is: " + c);

System.out.println("Next Sub");
System.out.print("Enter the first value: ");
Scanner sa=new Scanner(System.in);
int e = sa.nextInt();

System.out.print("Enter the second value: ");
Scanner sb=new Scanner(System.in);
int f = sb.nextInt();

int g = e-f;

System.out.println("The final result is: " + g);

System.out.println("Next multiple");
System.out.print("Enter the first value: ");
Scanner se=new Scanner(System.in);
int h = se.nextInt();

System.out.print("Enter the second value: ");
Scanner sf=new Scanner(System.in);
int i = sf.nextInt();

int j = h*i;

System.out.println("The final result is: " + j);

System.out.println("Next Div");
System.out.print("Enter the first value: ");
Scanner sg=new Scanner(System.in);
int k = sg.nextInt();

System.out.print("Enter the second value: ");
Scanner sh=new Scanner(System.in);
int l = sh.nextInt();

int m = l/k;

System.out.println("The final result is: " + m);


System.out.println("Next modules");
System.out.print("Enter the first value: ");
Scanner si=new Scanner(System.in);
int n = si.nextInt();

System.out.print("Enter the second value: ");
Scanner sj=new Scanner(System.in);
int o = sj.nextInt();

int p = n%o;

System.out.println("The final result is: " + p);


}
}