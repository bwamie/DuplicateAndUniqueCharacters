package com.bwamie.characterduplicates.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.bwamie.characterduplicates.main.UniqueCharacters;
import com.bwamie.characterduplicates.main.UniqueCharacters.Pair;

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
