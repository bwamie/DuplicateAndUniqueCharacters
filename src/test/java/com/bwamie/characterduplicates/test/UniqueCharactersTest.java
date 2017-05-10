package com.bwamie.characterduplicates.test;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

import com.bwamie.characterduplicates.main.*;
import com.bwamie.characterduplicates.main.UniqueCharacters.Pair;

import org.junit.Test;

public class UniqueCharactersTest {

	@Test
	public void testUniqueChars() {
		
		String expected1 = "abc";
		String expected2 = "xyz";
		Pair result = UniqueCharacters.uniqueChars("abcabcxyz");

		assertEquals(expected1, UniqueCharacters.stringfry(result.getCommon()));
		assertEquals(expected2, UniqueCharacters.stringfry(result.getUnique()));
	}

}
