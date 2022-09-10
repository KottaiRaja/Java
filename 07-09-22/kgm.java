class kgm{
public static void main(String arg[]){
int i,j,a;
for(i=2; i<100;i++){
        a=0;
for(j=2; j<100;j++){
       if(i%j==0){
            a=1;
             break;  
}
}
if(a==0){
     System.out.print(i + " ");
}
}
}
}

