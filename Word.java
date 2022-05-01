
import java.util.*;

public class Word {

public static void main(String[] args){

		List<String> list=new ArrayList<String>();

		list.add("vivek");
		list.add("pawar");
		list.add("pawar");
		list.add("vivek");
		list.add("vinayak");

		Map<String,Integer> map=new HashMap<String,Integer>();

		for(String s:list)
		 {
		      Integer integer=map.get(s);
		   if(integer==null){
		      map.put(s,1);

		       }else{
		        
		          map.put(s,integer+1);
		        }
		 }
		      System.out.println(map);

		}

}

