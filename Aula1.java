//Comentário em linha

/*
 * Comentário 
 * de 
 * Multiplas
 * linhas
*/

public class Aula1 { //Sempre criar classes para executar o código. Nome de classe inicia com letra maiúscula e precisa ter o mesmo nome do arquivo

    public static void main (String[] args) { //O método main é onde os comandos principais são executados
        System.out.println("Hello, wolrd!"); //Comando de saída, imprimindo no console

        //TIPOS PRIMITIVOS EM JAVA
        //Inteiros
        /*
         * byte - Suporta números de -128 a 127
         * short - Suporta números de -32768 a 32767
         * int - Suporta números de -2147483648 a 2147483647 (Mais usado porque quando se declara inteiro, o Java já entende como int)
         * long - Suporta números maiores que o int, de -9223372036854775808 a 922372036854775807 - Precisa-se colocar um "L" no final do valor para ele entender. Ex: long numero = 2146546540345303035405453l
        */

        //Flutuantes
        /*
         * float - Suporta números com uma casa depois do ponto flutuante e precisa-se colocar o "F" no final do valor. Ex: float numeroFlutuante = 1.64f
         * double - Suporta números com mais de uma casa após o ponto flutuante. (Mais usado porque quando se coloca o ponto flutuante, ele já entende como double, porém consome mais memória)
        */

        //Texto
        /*
         * char - Suporta apenas um caractere texto e precisa ser declarado com aspas simples
         * String (NÃO É PRIMITIVO, É TIPO CLASSE, POR ISSO PRECISA DECLARAR COM A PRIMEIRA LETRA MAIÚSCULA). Suporta Ilimitados caracteres em formato texto e precisa ser declarado com aspas duplas. Mais usado, porque indica texto
        */

        //Boolean
        /*
         * true - indica verdadeiro
         * false - indica false
        */

        String nome = "Alex";
        int idade = 31;
        String gostaDe = "Programação"; //Boas práticas camelCase
        boolean masculino = true;

        System.out.println("Olá, eu sou: " + nome + ", tenho: " + (idade + 1) + " anos, gosto de: " + gostaDe + ". Sexo masculino: " + masculino + ".");

        gostaDe = "Astronomia"; //Redeclaração de valor de variável

        System.out.println("Olá, eu sou: " + nome + ", tenho: " + (idade + 1) + " anos, gosto de: " + gostaDe + ". Sexo masculino: " + masculino + ".");
    }

}