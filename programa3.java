public class Prog3{
  public static void main(String[]args){

  double numero1;
  double numero2;
  double numero3;
  double resultado;
  Scanner scan = new Scanner(System.in);

  System.out.print("Escribe el primer numero: ");
  numero1 = scan.nextDouble();
  System.out.print("Escribe el segundo numero: ");
  numero2 = scan.nextDouble();
  System.out.print("Escribe el tercer numero: ");
  numero3 = scan.nextDouble();

  resultado = (numero1 + numero2 + numero3)/3;

  System.out.println("El resultado de la media es : " + resultado);
  }



}
