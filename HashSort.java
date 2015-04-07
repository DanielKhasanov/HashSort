import java.util.Arrays;

public class HashSort{
	public static void HashSort(int[] a){
		int length = a.length;
		int i = 0;
		while (i < length){
			int number = a[i];
			int hash = number % length;
			if (hash == i){
				i ++;
			}

			else {
				int number2 = a[hash];
				System.out.print("Comparing: ");
				System.out.print(number + " ");
				System.out.println(number2);
				
				if (((number - number2) > 0) && (i < hash)){
					
					a[i] = number2;
					a[hash] = number;
					System.out.println(Arrays.toString(a));

				}

				else if (((number - number2) < 0) && (i > hash)){
					a[i] = number2;
					a[hash] = number;
					System.out.println(Arrays.toString(a));
				}

				else if ((number - number2) == 0){
					if ((number - a[i - 1]) < 0){
						int next = a[i - 1];
						a[i - 1] = number;
						a[i] = next;
						System.out.println("swapped using next");
					}

					else {
						i ++;
					}

				}

				else{
					i++;
				}
			}

		}

		System.out.println(Arrays.toString(a));
	}
	public static void main(String[] args){
		int[] sample = new int[100];
		for (int x = 0; x < 100; x ++){
			sample[x] = (int) (Math.random() * 100);
		}
		HashSort(sample);
		

	}

}