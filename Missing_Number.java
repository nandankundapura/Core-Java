class Missing_Number {
	public static void main(String[] args) {
	

	int arr[]={1,2,6,5,4};
	int n=6;
	
	boolean found=false;
	for(int i=1;i<=n;i++) {
	// i=3
	for(int j=0;j<arr.length;j++) {
	if(i==arr[j]) {
		found=true;
		break;
		}
	}
	if(!found) {
		System.out.println("Missing number " + i);
		}
		found=false;
	}
	
	}
}