public class Main {

	public static void main(String[] args) {
	int[] numbers = {1,2,3,4,5,6};
		for(int i = 0; i<numbers.length; i++){
			System.out.println(numbers[i]);
	}

	public void printArray(int[] array){
		if(array.length != 0)
		{
			System.out.println(array[0]);
			printArray(array[1]);
		}
	}
}
