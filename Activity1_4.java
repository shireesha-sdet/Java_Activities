package actJava;

import java.util.Arrays;

public class Activity1_4 {
	static void ascendingSort(int array[]) {
        int size = array.length, i;
        
        for (i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;
            
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }
            array[j + 1] = key;
        }
    }
	public static void main(String[] args) {
		int[] num = {10,3,6,2,7};
		ascendingSort(num);
		System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(num));
	}

}
