package util;

import java.util.List;

public class Util {
 public static <T> void printAsATable(List<T> list) {
	 List<T> ls = list; 
	 int stride = ls.size() / 3;
	 for (int row = 0; row < ls.size() / 3; row++) {
	     System.out.println(String.format("%20s %20s %12s", ls.get(row),
	    		 ls.get(row + stride), ls.get(row + stride * 2)));
	 }
	 
 }
}
