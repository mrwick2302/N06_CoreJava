package org.tnsif.assignment;

public class orderchecker {

	 public boolean isReverseOrderCorrect(int n, int[] pinkyNumbers, int[] maryNumbers) {
	        for (int i = 0; i < n; i++) {
	            if (pinkyNumbers[i] != maryNumbers[n - 1 - i]) {
	                return false;
	            }
	        }
	        return true;
	    }
}
