public class Aula2 {

//Operadores aritiméticos em JAVA

    public static void main (String [] args) {

        int numero = 10;

        System.out.println(numero + 10); //Soma
        System.out.println(numero - 10); //Subtração
        System.out.println(numero * 10); //Multiplicação 
        System.out.println(numero / 10); //Divisão
        System.out.println(numero % 3); //Módulo

        System.out.println("Atribuições com operações aritiméticas");
        System.out.println(numero += 5);
        System.out.println(numero -= 5);
        System.out.println(numero *= 5);
        System.out.println(numero /= 5);
        System.out.println(numero %= 3);

        System.out.println("Operadores unários");
        System.out.println(++numero);
        System.out.println(--numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

    }


}