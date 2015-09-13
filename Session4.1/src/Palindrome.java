
public class Palindrome {

	public int constructNumber(int numberOfBits, int valueToPaste){
		int result[] = new int[100];
		result[numberOfBits - 1] = 1;
		result[0] = 1;
		// compute value to paste to base 2
		if (numberOfBits % 2 == 0){
			// result = 1 + valueToBase2 + reverse(valueToBase2) + 1
			return // resultToBase10
		}
		else{
			// result = 1 + valueToBase2 + reverse(valueToBase2) - lastBit + 1
			return // resultToBase10
		}
	}

	public int palindrome(int k){
		int bitNumber, checkSum, actualPower;
		bitNumber = 0;
		checkSum = 0;
		actualPower = 0;
		while (checkSum <= k){
			actualPower++;
			checkSum = (int) (checkSum + Math.pow(2,(double)actualPower));
			bitNumber++;
			if (checkSum > k){
				return constructNumber(bitNumber - 1, k - checkSum - (int)Math.pow(2, actualPower));
			}
			else{
				checkSum = (int) (checkSum + Math.pow(2,(double)actualPower));
				bitNumber++;
				if (checkSum > k){
					return constructNumber(bitNumber - 1, k - checkSum - (int)Math.pow(2, actualPower));
				}
			}
		}
	}
	
	public static void main(String[] args){
		int x;
		System.out.println(palindrome(x));
	}
}
