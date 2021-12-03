import java.util.*;
class MainList {
    public static void main(String args[])
    {
        Map<String, Integer> hm
            = new HashMap<String, Integer>();
  
        hm.put("a", 100);
        hm.put("b", 200);
        hm.put("c", 300);
        hm.put("d", 400);
        System.out.println(hm.remove("200"));
        System.out.println(hm.get("b"));

  
        // Traversing through the map
        for (Map.Entry<String, Integer> me : hm.entrySet()) {
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
    }
}

