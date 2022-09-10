import java.util.Scanner;
public class Array{
 public static void main(String args[]){
   Scanner a = new Scanner(System.in);
   System.out.print("Enter the number of element: ");
   int n=a.nextInt();
   int j[]=new int[n];
   System.out.print("Eneter the elements: ");
   Scanner c = new Scanner(System.in);
   for(int i=0;i<n;i++){
    j[i]=c.nextInt();
   }
   System.out.print("The array elements are:" );
   for(int i=0;i<n;i++){
    if(j[i]%2==0){
      System.out.print(j[i]+ ", ");
    }
    
   }
   System.out.println();
  
}
}
