package com.hackbulgaria51.week4.birthdayranges;

import java.util.Scanner;
import java.util.Vector;

public class BirthdayRangesSecondVariant {
	public static Vector<Integer> birthdaysCount(Vector<Integer> birthdays,
			Vector<IntPair> ranges) {
		int[] temp = new int[367];
		Vector<Integer> sumOfDates = new Vector<>();
		for (Integer date : birthdays) {
			temp[date] += 1;
		}
		int[] prefixSum = new int[367];
		for (int i = 1; i < prefixSum.length; i++) {
			prefixSum[i] += prefixSum[i - 1] + temp[i - 1];
		}
		for (int j = 0; j < ranges.size(); j++) {
			int start = ranges.get(j).start;
			int end = ranges.get(j).end;
			int res = prefixSum[end + 1] - prefixSum[start];
			sumOfDates.add(res);
		}
		return sumOfDates;
	}

	public static void main(String[] args) {
		Vector<Integer> birthdays = new Vector<Integer>();
		Vector<IntPair> ranges = new Vector<IntPair>();
		Scanner scanner = new Scanner(System.in);
		int bdaysCount = scanner.nextInt();
		int rangesCount = scanner.nextInt();
		for (int i = 0; i < bdaysCount; i++) {
			birthdays.add(scanner.nextInt());
		}
		for (int i = 0; i < rangesCount; i++) {
			IntPair pair = new IntPair();
			pair.start = scanner.nextInt();
			pair.end = scanner.nextInt();
			ranges.add(pair);
		}
		Vector<Integer> result = birthdaysCount(birthdays, ranges);
		for (int count : result) {
			System.out.println(count);
		}
		scanner.close();
	}
}