package org.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HashTreeSet {
public static void main(String[] args) {
	HashSet<Integer> hs =new HashSet<Integer>();
	hs.add(10);
	hs.add(20);
	hs.add(30);
	hs.add(40);
	hs.add(50);
	hs.add(60);
	hs.add(100000);
	hs.add(70);
	hs.add(80);
	hs.add(90);
	hs.add(10);
	hs.add(20);
	System.out.println(hs);
	LinkedHashSet<Integer> ls=new LinkedHashSet<Integer>();
	ls.addAll(hs);
	System.out.println(ls);
	TreeSet<Integer> ts=new TreeSet<Integer>();
	ts.addAll(ls);
	System.out.println(ts);
}
}
