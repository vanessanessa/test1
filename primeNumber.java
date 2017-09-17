public class primeNumber {
	public void isPrime(int n){
		int i = 2;
		boolean check = true;
		if(n > 0) {
			while(i <= Math.sqrt(n)){
				if(n % i == 0){
					check = false;
				}
				i++;
			}
		} else {
			System.out.println(n + " is a negative number. Please input a postive number.");
		}
		if(check){
			System.out.println(n + " is a prime number.");
		}else{
			System.out.println(n + " is not a prime number.");
		}
	}
}
