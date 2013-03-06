
package listlab;

import java.util.*;


public class ListLab1 {


    public static void main(String[] args) {
      
        List hobbies = new ArrayList();
        hobbies.add("Golfing");
        hobbies.add("Disc golf");
        hobbies.add("Baseball");
        hobbies.add("Snowboarding");
        hobbies.add("Pool");
        hobbies.add("Video games");
        
        for (int i = 0; i < hobbies.size(); i++){
            String s = (String)hobbies.get(i);
            System.out.println(s);
        }
    }
}
