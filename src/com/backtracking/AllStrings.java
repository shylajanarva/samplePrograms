package com.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author shyn
 * Generate all binary strings of n bits
 */
public class AllStrings {
	static int a[] ;
	public static void main(String args[]) throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(in.readLine());
		a = new int[n];
		binary(n);
	}

	private static void binary(int n) {
		if(n<1)
			printArray();
		else{
			a[n-1] = 0;
			binary(n-1);
			a[n-1] = 1;
			binary(n-1);
		}
	}

	private static void printArray() {
		for(int i = 0; i < a.length ; i++)
		{
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
