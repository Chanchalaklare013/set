package Collection.Set;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class _3Prectice 
{
 public static void main(String[] args) 
 {
  Queue<String> q=new LinkedList<>(Arrays.asList("java","c","c++","js")); 
  q.add("html");//add method
  System.out.println(q);
  System.out.println(q.peek());// show first value
  System.out.println(q.element());/*show first value */
  q.remove("html");//remoe the element of first
  System.out.println(q);
  q.offer("css"); // add element in the last of list
  System.out.println(q);
  q.poll(); //remove the first value of list
  System.out.println(q);

  
 
    
 }   
}
