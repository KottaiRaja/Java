
class ClassA extends Thread{
    public void run(){
        System.out.println("Start Thread A...");
        for(int i=1; i<=5; i++){
            if(i==1)
            System.out.println("From Thread A:i=" +i);
            
        }
        System.out.println("....Exit Thread A");
    }
}

class ClassB extends Thread{
    public void run(){
        System.out.println("Start Thread B...");
        for(int j=1; j<=5; j++){
            if(j==2)
                System.out.println("From Thread B:j=" +j);
            
        }
        System.out.println("....Exit Thread B");
    }
}

class ClassC extends Thread{
    public void run(){
        System.out.println("Start Thread C...");
        for(int k=1; k<=5; k++){
            System.out.println("From Thread C:k=" +k);
            if(k==3){
                try{
                    sleep(1000);
                }catch(Exception e){
                    
                }
            }
                
            
        }
        System.out.println("....Exit Thread B");
    }
}

public class Thread_State{
    public static void main(String args[]){
        ClassA t1 = new ClassA();
        
        ClassB t2= new ClassB();
        ClassC t3 = new ClassC();
        t3.yield();
        t1.start();t2.run();t3.start();
        System.out.println("....End");

    }
}