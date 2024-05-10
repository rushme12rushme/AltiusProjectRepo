package qsp;

import java.util.HashMap;
import java.util.Set;


public class TableDataProc {

	public static void main(String[] args) {
			HashMap <Integer,Integer> hm=new HashMap<> ();
			hm.put(1,100);
			hm.put(2,200);
			hm.put(3,100);
			System.out.println(hm);
			Set <Integer> s=hm.keySet();
			
			
			for(Integer i:s)
			{
				System.out.println(hm.get(i));
				
			}
			
			
	}

}
