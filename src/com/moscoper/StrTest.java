package com.moscoper;

public class StrTest {
	// private static String str1 = "hello";
	public static void test(Test t) {
		System.out.println("" + t.str1);
		t.str1++;
//		System.out.println(str);
	}

	public static void main(String[] args) {
		Test t = new Test();

		test(t);
		System.out.println(t.str1);
	}
}

class Test {
	int str1 = 1;

}
