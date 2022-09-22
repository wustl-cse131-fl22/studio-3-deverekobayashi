package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Value for n");
		int n = (in.nextInt()-1);
		int[] nArray = new int[n];
		for (int o=0; o<nArray.length;o++) {
			nArray[o]= o+2;

		}

	for (int p=2;p<(nArray.length);p++) {

			for (int i = (p*p)-2; i<nArray.length; i++){

				if (nArray[i] % p ==0)
				{nArray[i]=0;}



			}
		}
		for (int j =0; j<nArray.length;j++) {
			if (nArray[j] != 0 )
				System.out.println(nArray[j]);
		}
	}

}

