package com.ljheee.example;

import java.util.Calendar;
import java.util.Scanner;

/**
 * ����̨ �������£���ӡ����Ǹ��µ�����
 * @author ljheee
 *
 */
public class CalendarDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("���������:");
		int year = sc.nextInt();
		System.out.println("�������·�:");
		int month = sc.nextInt();

		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month - 1);
		cal.set(Calendar.DATE, 1);

		int maxDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		// System.out.println(maxDay);
		int weekDay = cal.get(Calendar.DAY_OF_WEEK);

		System.out.println("\t\t" + year + "��" + month + "�µ�����");
		System.out.println("��\tһ\t��\t��\t��\t��\t��");
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