/** Autor: ❣️🚀❣️ Vitor de Jesus ❣️🚀❣️
 * Data: 14/06/2023
 * **/

public class Main {
    public static void main(String[] args) {


        /**
         *  No codigo abaixo Objetos, salvas na memoria Heap
         * **/

        Player player1 = new Player("Mario");

        Player player2 = new Player("Mario");

        if (player1 == player2) {
            System.out.println("Os Objetos Sao Iguais");
        } else {
            System.out.println("Os Objetos Sao Diferentes");
        }



        /**
         *  No codigo abaixo variaveis, salvas na memoria Stack
         * **/

        // Construtor da Play
        String objPlayer1;
        objPlayer1 = "Mario";

        // Construtor da Play
        String objPlayer2;
        objPlayer2 = "Mario";

        if (objPlayer1 == objPlayer2) {
            System.out.println("As variaveis Sao Iguais");
        } else {
            System.out.println("As variaveis Sao Diferentes");
        }

    }
}