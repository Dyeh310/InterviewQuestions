package p1.computing;

public class AddingLists {

	
	public static int addFor (int [] list) {
		int sum = 0;
		
		for (int i = 0; i < list.length; i++) {
			sum += list[i];
		}
			
			
		return sum;
	}
	
	public static int addWhile (int[] list) {
		int sum = 0;
		int i = 0;
		
		while (i < list.length) {
			sum += list[i];
			i++;

		}
		
		return sum;
		
	}
	
	public static int sumOfArray(int[] a, int n) {
	    if (n == 0)
	        return a[n];
	    else
	        return a[n] + sumOfArray(a, n-1);
	}
	
	public static void main(String[] args) {
		
		int[] list = new int[] {5,6,7,10,6};
		
		System.out.println(AddingLists.addFor(list));
		System.out.println(AddingLists.addWhile(list));
		System.out.println(AddingLists.sumOfArray(list, list.length-1));
		
	}

}
