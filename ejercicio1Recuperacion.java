public class Ejercicio1Recuperacion{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.print("Escribe el precio de un producto: ");
    double precioProducto = scan.nextDouble();

    int monedasUnEuro = 0;
    monedasUnEuro = 1 * (int)precioProducto;
    System.out.print("Tengo" + monedasUnEuro + "monedas de un euro");


  }



}
