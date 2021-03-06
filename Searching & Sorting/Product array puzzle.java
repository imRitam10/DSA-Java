class Solution { 
	public static long[] productExceptSelf(int arr[], int n) { 
		
		long[] prod = new long[n];
		// Base case 
		if (n == 1) { 
			prod[0] = 1;
			return prod; 
		} 

		long temp = 1; 

		/* Initialize the product array as 1 */
		for (int i = 0; i < n; i++) 
			prod[i] = 1; 

		/* In this loop, temp variable contains product of 
		elements on left side excluding arr[i] */
		for (int i = 0; i < n; i++) { 
			prod[i] = temp; 
			temp *= arr[i]; 
		} 
		/* Initialize temp to 1 for product on right side */
		temp = 1; 

		/* In this loop, temp variable contains product of 
		elements on right side excluding arr[i] */
		for (int i = n - 1; i >= 0; i--) { 
			prod[i] *= temp; 
			temp *= arr[i]; 
		} 
		return prod; 
	} 
} 