package com.DataStructure.String;

public class commonSuffix {
  public static void main(String args[]) {
	  String array[] = {"fieldcorn","fieldout" , "fielddelta"};
	  String array1[] = {"cornfield","outfield"};
	  for(int i =0; i<array[0].length() ; i++) {
		  System.out.print(array[0].charAt(i) +" ");
	  }
	  System.out.println("");
	  String prefix =  new commonSuffix().longestCommonPrefixMethodTwo(array);
      System.out.println(prefix);
      String suffix = new commonSuffix().longestCommonSuffix(array1);
      StringBuilder builder = new StringBuilder();
      builder.append(suffix);
      suffix = builder.reverse().toString();
      System.out.println(suffix);
    }
    public String longestCommonPrefixMethodOne(String[] strs) {
	     if (strs.length == 0) return "";
	     String prefix = strs[0];
	    for(int i = 1; i < strs.length; i++)
	        while (strs[i].indexOf(prefix) != 0) {
	        	prefix = prefix.substring(0, prefix.length() - 1);
	            if (prefix.isEmpty()) return "";
	        }        
	    return prefix;   
    }
    
    public String longestCommonPrefixMethodTwo(String[] strs) {
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
    
    public String longestCommonSuffix(String strs[]) {
    	StringBuilder builder = new StringBuilder();
    	int min = 100000;
    	for(int i =0 ; i<strs.length ; i++) {
    		if(strs[i].length() < min) {
    			min = strs[i].length();
    		}
    	builder.append(strs[i]);
               strs[i] = builder.reverse().toString();
    	}
        if (strs == null || strs.length == 0) return "";
        for (int i = 0; i < strs[0].length() ; i++){
            char c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j ++) {
                if (i == strs[j].length() || strs[j].charAt(i) != c)
                    return strs[0].substring(0, i);             
            }
        }
        return strs[0];
    }
}