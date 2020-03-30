package com.liujiadong.movie.utils;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class PersonTest {

	@Test
	public void test() {
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			Calendar can=Calendar.getInstance();
			can.set(2010, 0, 1);
			Date date = new Date();long time = date.getTime();
			Date time1 = can.getTime();long time2 = time1.getTime();
			double random = Math.random();
			long x=(long) (((time2-time)*random)+time);
			Date date2 = new Date(x);
			SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd hh-mm-ss");
			String format = simpleDateFormat.format(date2);
			p.setCreated(format);
			System.out.println(p);
		}
	}

}
