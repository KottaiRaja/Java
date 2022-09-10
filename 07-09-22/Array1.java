import java.util.*;
public class Array1{
public static void main(String args[]){
System.out.print("Enter the value: ");
Scanner a = new Scanner(System.in);
int b = a.nextInt();
int j[] = new int[b];

System.out.print("Enter the number of elements: ");
for(int i=0; i<b; i++){
j[i]=a.nextInt();
}
for(int i=0; i<b; i++){
for(int k=i+1; k<b;k++)
{
90,12,32,11
if(j[i]>j[k]){
int temp = j[i];
j[i] = j[k];
j[k] = temp;
}

}
System.out.print(j[i]+ ", ");
}
}
}

 