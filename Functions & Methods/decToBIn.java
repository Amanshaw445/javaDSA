// This program uses a function to convert decimal number to binary number.


import java.util.*;
import java.lang.Math;

class decToBin {

public static void convertDecToBin(int decNum) {
	int myNum = decNum;
	int pow = 0;
	int binNum = 0;

	while(decNum > 0) {
	int reminder = decNum % 2;
	binNum = binNum + (reminder * (int)Math.pow(10, pow));
	pow++;
	decNum = decNum/2;
	}
System.out.println("The binary of "+ myNum +" is " + binNum);
}

public static void main(String args[]) {
	convertDecToBin (5);
}
}