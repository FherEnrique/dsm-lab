import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Ingrese el numero A: ");
      int num1=in.nextInt();
      System.out.print("ingrese el numero B: ");
      int num2=in.nextInt();
      if(num1%num2==0){
        System.out.print("Los numeros son divisibles");
      }
      else{
        System.out.print("Los numeros no son divisibles");
      }
  }
}