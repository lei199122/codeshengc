package com.sxt;

import java.util.Scanner;

public class Hello {
	
		static int A = 1;
		static int B = 2;
		static int C = 3;
		static int D = 4;
		int E = 5;
		static int F = 6;
		static int G = 7;
		
		
	public static void main(String[] args) {
		System.out.println("你好");
		System.out.println("你在搞么事");
		System.out.println(add());
		System.out.println(delete());
		System.out.println(off());
	}
	
	public static int  add() {
		int a = B + C;
		int b = G + D;
		int c = a + b;
		return c;
	}
	
	public static int delete() {
		int d = G - A;
		int f = F - C;
		int g = d - f;
		return g;
		
	}
	
	@SuppressWarnings("resource")
	public static String off() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份");
		int years = sc.nextInt();
		if(years%4== 0 && years%100 != 0 ||years%400 == 0) {
			return "是闰年";
		}else {
			return"不是闰年";
		}
		
	}
}
