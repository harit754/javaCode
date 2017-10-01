package DP;

import java.util.Arrays;

public class EggProblem {
	
	
	// link https://github.com/gkcs/ChainReaction/blob/master/src/main/java/main/java/videos/EggSolver.java
	
	// solve minimum tries to find threshold floor by throwing (max)e eggs from n floor tower 
	// find worst case
	 public static int solveUsingDp(int n, int k) {
	        final int results[][] = new int[n + 1][k + 1];
	        for (int i = 0; i < n + 1; i++) {
	            results[i][1] = i;
	        }
	        for (int i = 0; i < k + 1; i++) {
	            results[1][i] = 1;
	        }
	        for (int i = 2; i < n + 1; i++) {
	            for (int j = 2; j < k + 1; j++) {
	                results[i][j] = Integer.MAX_VALUE;
	                for (int x = 1; x < i; x++) {
	                    final int brokenEggResult = results[x - 1][k - 1];
	                    final int EggSurvivedResult = results[i - x][k];
	                    int temp = Math.max(brokenEggResult, EggSurvivedResult) + 1;
	                    if (temp < results[i][j]) {
	                        results[i][j] = temp;
	                    }
	                }
	            }
	        }
	        for (final int[] a : results) {
	            System.out.println(Arrays.toString(a));
	        }
	        return results[n][k];
	    }
	 
	 public static void main(String[] args) {
		int ans= solveUsingDp(5,2);
		System.out.println(ans);
	}

}
