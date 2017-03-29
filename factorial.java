import java.math.BigInteger;
import java.util.Scanner;

public class factorial {
	
	public static BigInteger fact(BigInteger num) {
		if (num.compareTo(BigInteger.ONE)<=0) {
			return BigInteger.ONE;
		} else {
			return num.multiply(fact(num.subtract(BigInteger.ONE)));
		}
	}
	
	public static long getNumber() {
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
<<<<<<< HEAD
		BigInteger num = BigInteger.valueOf(scanInput.nextLong());
		
		if (num.compareTo(BigInteger.ZERO)<0) {
=======
		long num = scanInput.nextLong();
		scanInput.close();
		return num;
	}
	
	public static void showFac(long num) {
		if (num<0) {
>>>>>>> refacIO
			System.out.println("El factorial no esta definido" +
" para numeros negativos");
		} else {
			BigInteger fac = fact(num);
			
			System.out.println("El factorial de "+num+" es "+fac);
		}
<<<<<<< HEAD
    
		scanInput.close();
=======
	}
	
	public static void main(String []args) {
		long num = getNumber();
		
		showFac(num);
>>>>>>> refacIO
	}

}

