package hometaski;

/*public class Primes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int nValues = 50;
		boolean isPrime = true;
		firstloop : 
			for(int i = 2; i <= nValues; i++)
		{
		isPrime = true; 

		secondloop:
			for (int j = 2; j < i; j++)
		{
		if (i % j == 0)
		{
		isPrime = false;
		continue firstloop;
		}
		}
		System.out.println(i);
		}
		}
		

	}*/

public class PrimesOptimized {
    public static void main(String[] args) {
        int nValues = 50;
        outerloop: // Labeled continue
        for (int i = 2; i <= nValues; i++) {
            // No need for isPrime variable

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    continue outerloop; // Skip to the next number if i is divisible
                }
            }

            System.out.println(i);
        }
    }
}








