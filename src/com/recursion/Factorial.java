package com.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws IOException{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(in.readLine());
		System.out.println("Factorial :"+print(n));
	}

	private static int print(int n) {
		
		if( n==0 )
		{
			return 1;
		}
		else{			
			return n*print(n-1);
		}

	}

}
