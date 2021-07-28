package Practice;

import java.util.*;
class HashSet1{  
 public static void main(String args[]){  
  //Creating HashSet and adding elements  
    TreeSet<String> set=new TreeSet();
           set.add("One");    
           set.add("Two");    
           set.add("Three");   
           set.add("Four");  
           set.add("Five");  
//           Iterator<String> i=set.iterator();
//           while(i.hasNext())
//           {
//           System.out.println(i.next());
//           }
     System.out.println(set);
     set.add("Five");
     set.add("Five");
     set.add("Two");
     set.add("One");
     System.out.println(set);
 }  
}  