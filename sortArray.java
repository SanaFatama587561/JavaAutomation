package selenium_test_learn;

public class sortArray {

	public static void main(String[] args) {

		int arr[]= new int[] {2,8,9,6,3};
		int temp=0;
		System.out.println("Oroginal array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");


		}

		for(int i=0;i<arr.length;i++) {
			for(int j= i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
		}
		
		System.out.println("sorted array");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+",");

		// TODO Auto-generated method stub

	}

}
}
