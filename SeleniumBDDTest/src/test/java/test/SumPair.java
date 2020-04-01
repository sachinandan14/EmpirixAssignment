package test;

import java.util.ArrayList;

public class SumPair {
	
	
	public static void main(String[] args) {
		
		int[] x = {5,2,3,7,10};

		for(int i=0;i<=x.length;i++){
		 int first = x[i];
		for(int j=1;j<x.length;j++){
		 int second= x[j];
		 if(first+second==10) {
			 System.out.println("elem"+x[i]);
			 System.out.println("elem"+x[j]);
		 }
	}

		}}}


