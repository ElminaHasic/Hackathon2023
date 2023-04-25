package HackathonCodeSmash;

import java.util.ArrayList;

public class Foo {

    public static int IsBuyerWinner(ArrayList<String> codeList, ArrayList<String> shoppingCart)
    {
    	//trivial solution
    	if (codeList.size() == 0)
    		return 1;
    	if (shoppingCart.size() == 0)
    		return 0;
    	if (shoppingCart.size() < codeList.size())
    		return 0;
    	
    	//local variables
    	int group_counter = 0;
    	String[] group_arr = codeList.get(group_counter).split("\\s");
    	int group_arr_counter = 0;
    	int max_group_counter = codeList.size();
    	int match_counter = -1;
    	String anything = "anything";
    	int current_counter= match_counter;
    	
    	
    	for (int i = 0; i<shoppingCart.size(); i++) { 
    		
    		if (group_arr_counter >= group_arr.length) {
    			group_arr_counter = 0;
    			group_counter++;
    			group_arr = codeList.get(group_counter).split("\\s");	
    		}
    	 if (group_arr[group_arr_counter].equals(shoppingCart.get(i)) || group_arr[group_arr_counter].equals(anything)) {
    		 if (group_counter == max_group_counter-1 && group_arr_counter == group_arr.length - 1) {
    			 return 1;
    		 }
    		 if (group_counter == 0 && group_arr_counter == 0) {
    			 match_counter = i;
    			 
    		 }
    		 group_arr_counter++;
    	 } else {
    		 if (match_counter!=current_counter) {
    			 i = match_counter;
    			 current_counter = match_counter;
    		 }
    		 group_arr_counter = 0;
    		 group_counter = 0;
    		 group_arr = codeList.get(group_counter).split("\\s");
    	 }
         
    	}
    	
    	return 0;
    }
}
