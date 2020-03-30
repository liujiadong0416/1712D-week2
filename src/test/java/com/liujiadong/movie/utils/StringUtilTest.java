package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean hasLength = StringUtil.hasLength("");
		System.out.println(hasLength);
	}
	
	@Test
	public void testHasText() {
		boolean hasText = StringUtil.hasText("");
		System.out.println(hasText);
	}

	@Test
	public void testRandomChineseString() {
		String randomChineseString = StringUtil.randomChineseString(5);
		System.out.println(randomChineseString);
	}

	@Test
	public void testGenerateChineseName() {
		String generateChineseName = StringUtil.generateChineseName();
		System.out.println(generateChineseName);
	}

}
