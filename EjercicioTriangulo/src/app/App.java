//Ej. MI-7: Dado un triángulo representado por sus lados L1, L2, L3, 
// determinar e imprimir una leyenda según sea: equilátero, isósceles o escálenos.

package app;

import java.util.Scanner;

public class App {

    public static Scanner Teclado = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        Triangulo triangulos = new Triangulo();

        System.out.println("Insira el primer lado del triángulo");

        triangulos.setLadoUno(Teclado.nextInt());

        System.out.println("Insira el segundo lado del triángulo");

        triangulos.setLadoDos(Teclado.nextInt());

        System.out.println("Insira el tercer lado del triángulo");

        triangulos.setLadoTres(Teclado.nextInt());

        triangulos.determinarTipoDeTriangulo();

        //System.out.println("El triangulo es un " + triangulos.determinarTipoDeTriangulo());

    }
}          