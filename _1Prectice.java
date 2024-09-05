package Collection.Set;
 
import java.util.Arrays;
import java.util.HashSet;

public class _1Prectice 
{
 public static void main(String[] args) 
 {
  HashSet<String> sh=new HashSet<>(Arrays.asList("java","c","c++","Ruby","R","css","js","java")); 
  HashSet<Integer> hs=new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));   
  System.out.println(sh);
  sh.add("HTML");
  System.out.println(sh);
 // sh.forEach(null);//consumer?
  System.out.print(sh);
  System.out.print(hs);
  for(String i:sh)
  {
    System.out.println(i);
  }
  for(Integer i:hs)
  {
   System.out.println(i);
  }
 }   
}
