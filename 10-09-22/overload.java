public class overload{
    public static void talk()
    {
        System.out.println("hello there!");
    }
    public static void talk(String name){
        System.out.println(name);
    }
    public static void main(String args[]){
        talk("Hello");
    }
}