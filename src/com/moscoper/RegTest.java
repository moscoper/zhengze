package com.moscoper;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegTest {
	static void test() {
		Pattern pattern = null;
		Matcher matcher = null;

		// pattern = Pattern.compile("(\\w+\\.)*\\w+@\\w+(\\.\\w+)+");//��֤����
		// pattern = Pattern.compile("^1[358]\\d{9}");//��֤�ֻ���
		// pattern = Pattern.compile("\\d{1,3}(\\.\\d{1,3}){3}");//��֤ip
		// pattern = Pattern.compile("^[\u4e00-\u9fa5]+$");// ��֤����
		pattern = Pattern.compile("^([^\\s]*\\w){5,}");// ��֤����
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
