package Collection.Set;

//import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class _2Prectice 
{
 private static Object entry;

public static void main(String[] args) 
 {
  HashMap<String,String> hm=new HashMap<>();
  hm.put("s01","shanu" );
  hm.put("s02", "riya");
  hm.put("s03", "sonu");
  System.out.println(hm);
 System.out.println( hm.containsKey(02));
 System.out.println(hm.get(02));
 hm.remove(03);
for(Map.Entry<String,String> entry:hm.entrySet())
 {
  String k=entry.getKey();
  String v=entry.getValue();
 System.out.println("Key is  "+k+" Value is "+v); 
 }
 



 }   
}
