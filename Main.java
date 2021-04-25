public class Main {

	public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6};
		
			printArray(numbers);
	}

	public static void printArray(int[] array){
		if(array.length != 0)
		{
			System.out.println(array[0]);
			int[] newArray = new int[array.length -1];
			for(int i = 1; i<array.length; i++) {
				newArray[i-1] = array[i];
			}
			printArray(newArray);
		}
	}
}
