package com.ljheee.example;

import java.util.Calendar;
import java.util.Scanner;

/**
 * 控制台 输入年月，打印输出那个月的日历
 * @author ljheee
 *
 */
public class CalendarDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份:");
		int year = sc.nextInt();
		System.out.println("请输入月份:");
		int month = sc.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);

		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// System.out.println(maxDay);
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\t\t" + year + "年" + month + "月的日历");
		System.out.println("日\t一\t二\t三\t四\t五\t六");
		for (int i = 1; i < weekDay; i++) {
			System.out.print("\t");
		}
		for (int i = 1; i <= maxDay; i++) {
			System.out.print(i + "\t");
			if ((i + weekDay - 1) % 7 == 0) {
				System.out.println();
			}
		}

	}

}