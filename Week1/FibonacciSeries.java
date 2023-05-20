package com.gl.prework;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c,i;
		a=-1;
		c=1;
		i=1;
		while (i<=10) {
			b=a+c;
			System.out.println(b);
			a=c;
			c=b;
			i++;
		}

	}

}
