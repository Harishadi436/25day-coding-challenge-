package com.Array;
import java.util.HashSet;
import java.util.Set;

public class Removing_dub {
	  public static void main (String[] args)
	  {
	     int a[] = {10, 20, 20, 30, 40, 40, 40, 50, 50};
	     Set hash_Set = new HashSet();
	for (int i=0; i<a.length-1; i++)
	hash_Set.add(a[i]);

	System.out.print(hash_Set);
	}
	}


