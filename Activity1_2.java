package actJava;

public class Activity1_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] num = {10,77,10,54,-11,10};
		int searchNum = 10;
        int fixedSum = 30;

        
        System.out.println("Result: " + result(num, searchNum, fixedSum));
    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int sum = 0;
        
        for (int number : numbers) {
            
            if (number == searchNum) {
                
                sum += searchNum;
            }

            
            if (sum > fixedSum) {
                break;
            }
        }

        //Return true if condition satisfies
        return sum == fixedSum;
    }

	}


