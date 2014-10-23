package com.moscoper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	static void test() {
		Pattern pattern = null;
		Matcher matcher = null;

		// pattern = Pattern.compile("(\\w+\\.)*\\w+@\\w+(\\.\\w+)+");//验证邮箱
		// pattern = Pattern.compile("^1[358]\\d{9}");//验证手机号
		// pattern = Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3}");//验证ip
		// pattern = Pattern.compile("^[\u4e00-\u9fa5]+$");// 验证中文
		pattern = Pattern.compile("^([^\\s]*\\w){5,}");// 验证中文
		matcher = pattern.matcher("     saqwert");
		System.out.println(matcher.matches());
	}

	static void test2() {
		Pattern pattern = Pattern.compile("\\w(\\d\\d)(\\w+)");
		Matcher matcher = pattern.matcher("aa11bbb");
		int count = matcher.groupCount();
		if (matcher.find()) {
			for (int i = 0; i < count; i++) {
				System.out.println("===" + i + "====" + matcher.group(i));
			}
		}

	}

	public static void main(String arg[]) {
		test();
		System.out.println("===I am a branch2===");
	}
}
