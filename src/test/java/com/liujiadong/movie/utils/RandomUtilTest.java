package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		int random = RandomUtil.random(3, 5);
		System.out.println(random);
	}

	@Test
	public void testSubRandom() {
		int[] subRandom = RandomUtil.subRandom(1, 10, 5);
		for (int i : subRandom) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		char randomCharacter = RandomUtil.randomCharacter();
		System.out.println(randomCharacter);
	}

	@Test
	public void testRandomString() {
		String randomString = RandomUtil.randomString(5);
		System.out.println(randomString);
	}

}
