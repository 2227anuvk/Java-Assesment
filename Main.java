import java.util.*;
public class Main {
   public static void main(String[] args) {

      ArrayList<Integer> List_Array = new ArrayList<Integer>();
      List_Array.add(10);
      List_Array.add(20);
      List_Array.add(30);
      List_Array.add(40);

       		

      /* Advanced For Loop*/ 		
      System.out.println("Advanced For Loop:"); 		
      for (Integer Integer_Number : List_Array) { 		      
           System.out.println(Integer_Number); 		
      }

      /* While Loop */ 		
      System.out.println("While Loop:"); 		
      int i = 0; 		
      while (List_Array.size() > i) {
	 System.out.println(List_Array.get(i));
         i++;
      }

      /* For Loop*/
      System.out.println("For Loop:");
      for (int j = 0; j < List_Array.size(); j++) { 		      
          System.out.println(List_Array.get(j)); 		
      } 
   }
}
