class Second_Largest {
public static void main(String[] arg) {
	
	int[] arr={10,20,30,40,50};
	
	int largest=arr[0];
	int secondLargest=arr[1];
	for(int i=0;i<arr.length;i++) {
	if(arr[i]>largest) {
		secondLargest=largest;
		largest=arr[i];
		}
		else if (arr[i]>secondLargest) {
			secondLargest=arr[i];
		}
	}
	System.out.println("Second largest " + secondLargest);
}
}
