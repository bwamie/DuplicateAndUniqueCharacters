package com.bwamie.characterduplicates.main;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCharacters {

	public static class Pair {
		private Set<Character> unique;
		private Set<Character> common;

		public Pair(Set<Character> unique, Set<Character> common) {
			this.unique = unique;
			this.common = common;
		}

		public Pair() {
			unique = new LinkedHashSet<>();
			common = new LinkedHashSet<>();
		}

		public Set<Character> getUnique() {
			return unique;
		}

		public void setUnique(Set<Character> unique) {
			this.unique = unique;
		}

		public Set<Character> getCommon() {
			return common;
		}

		public void setCommon(Set<Character> common) {
			this.common = common;
		}
		
	}

	public static void main(String args[]) {
		Pair result = uniqueChars("abcabcxyz");
		System.out.println("Unique: "+ stringfy(result.getUnique()));
		System.out.println("Duplicate: "+stringfy(result.getCommon()));
	}

	public static Pair uniqueChars(String s) {
		Pair p = new Pair();
		for(Character c: s.toCharArray()){
			if(p.unique.contains(c) || p.common.contains(c)){ 
				p.common.add(c);
				p.unique.remove(c);
				System.out.println(c);
			}
			else{
				p.unique.add(c);
			}
		}
		return p;
	}
	
	public static String stringfy(Set<Character> chrs){
		StringBuilder sb = new StringBuilder();
		 chrs.forEach(s->{sb.append(s);});
		 System.out.println(sb.toString());
		 return sb.toString();
	}

}
