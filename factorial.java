public static long getNumber() {
		Scanner scanInput = new Scanner(System.in);
		System.out.print("Introduzca un numero: ");
		long num = scanInput.nextLong();
		scanInput.close();
		return num;
	}
	
	public static void main(String []args) {
		long num = getNumber();
		
		if (num<0) {
			System.out.println("El factorial no esta definido" + 
" para numeros negativos");
		} else {
			long fac = fact(num);
			
			System.out.println("El factorial de "+num+" es "+fac);
		}
	}

