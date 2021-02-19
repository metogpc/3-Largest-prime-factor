
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
			The prime factors of 13195 are 5, 7, 13 and 29.
			What is the largest prime factor of the number 600851475143 ?
		*/

		//600851475143 sayýsýnýn en büyük asal çarpaný
		
		long y=600851475143L;
		long x;
		long sayi=0;
		
		
		for(long i=2;i<y;i++) {
			
			if(y%i==0) {
				if(sayi<i)
					sayi=i;
				y=y/i;
			}
			
		}
		
		
		System.out.println((long)y);
		
	}

}
