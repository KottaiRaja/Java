import java.util.*;
public class hash{
public static void main(String args[]){
Set<String> hs = new TreeSet<String>();
hs.add("Web");
hs.add("Developer");
hs.add("Full");
hs.add("Stack"); 
System.out.println(hs);
hs.remove("Stack");
System.out.println(hs);
hs.size();
System.out.println(hs);
TreeSet<String> st = new TreeSet<String>(hs);
System.out.println(st.first());
System.out.println(st.last());
}
}