package org.add;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Dayone {
	public static void main(String[] args) {
      Map<Integer, String> m=new HashMap<Integer, String>();
       m.put(1,"csk");
       m.put(2,"msk");
       m.put(3,"rcb");
       m.put(4,"rk");
       m.put(5,"src");
       m.put(6,"ecr");
       System.out.println(m);
       
       System.out.println(m.size());
      
       String string=m.get(5);
       System.out.println(string);
       
       Set<Integer>keSet=m.keySet();
       System.out.println(keSet);
       
       Collection<String>values=m.values();
       System.out.println(values);
       
       Boolean containskey=m.containsKey(3);
       System.out.println(containskey);
       
       Boolean containsvalue=m.containsValue("sow");
       System.out.println(containsvalue);
       
       Set<Entry<Integer,String>>entryset=m.entrySet();
       System.out.println(entryset);
       
       for (Entry<Integer, String> entry : entryset) {
    	   Integer key = entry.getKey();
    	   System.out.println(key);
    	   
    	   String value=entry.getValue();
    	   System.out.println(value);
		
	}
		
	}
}


