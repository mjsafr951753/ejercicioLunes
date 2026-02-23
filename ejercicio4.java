public class prog4{
	double pvp;
	final double IVA = 0.21;
	double pvpFinal;
	Scanner scan = new Scanner(System.in);

	System.out.print("Precio del producto:");
	pvp = scan.nextDouble();

	pvpFinal = pvp * IVA + pvp;
	System.out.println("Precio final con IVA " + pvpFinal);
}

Viendo ejercicio en java
