//this code uses a function to convert binary number in decimal.


import java.util.Scanner;
import java.lang.Math;

class binToDec{

public static void convertBinToDec(int binNum){
	int myNum = binNum;
	int pow = 0;
	int decNum = 0;

	while(binNum > 0){
	int lastDight = binNum % 10;
	decNum = decNum + (lastDight * (int)Math.pow(2, pow));
	pow++;
	binNum = binNum/10;
	}
		System.out.println(" the decimal of " + myNum + " is " + decNum);
}

public static void main (String args[]){
	convertBinToDec(101);
}

}