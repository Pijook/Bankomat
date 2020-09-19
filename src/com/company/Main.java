package com.company;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /**
         * Jakub Bielecki 4E nr 2
         */

        //Tworze nowy scanner do pobierania tekstu
        Scanner scanner = new Scanner(System.in);

        //Tworze tablice z nominalami
        int nominaly[] = new int[]{500,200,100,50,20,10,5,1};
        //Tworze nowa liste w ktorej bede zapisywal uzyte banknoty
        LinkedList<Integer> uzyte_banknoty = new LinkedList<>();

        System.out.println("Podaj kwote");
        //Pobieram kwote do wydania
        int kwota = scanner.nextInt();

        //Zmienna pomocnicza do pobierania nominalow z tablicy
        int i = 0;

        //Petla - dopoki kwota jest wieksza od najmniejszego nominalu
        while(kwota > nominaly[nominaly.length - 1]){
            //Pobieram nominal z tablicy
            int nominal = nominaly[i];

            //Uzywam danego nominalu dopoki kwota nie jest od niego mniejsza
            while(kwota >= nominal){
                //Dopisuje nominal do listy
                uzyte_banknoty.add(nominal);
                //Zmniejszam kwote o nominal
                kwota = kwota - nominal;
            }
            //Jezeli kwota jest mniejsza od nominalu zwiekszam i zeby wziac nastepny nominal
            i++;
        }

        //Za pomoca petli foreach wyswietlam uzyte banknoty
        System.out.println("Uzyte nominaly");
        for(int key : uzyte_banknoty){
            System.out.println(key);
        }
        //Wyswietlam reszte
        System.out.println("Reszta: " + kwota);

    }
}
