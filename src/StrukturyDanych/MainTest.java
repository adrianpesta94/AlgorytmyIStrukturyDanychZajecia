package StrukturyDanych;

import StrukturyDanych.kolejka.KolejkaList;
import algorytmy.ONP;

import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {
//        wywolajStosTab();

//        wywolajStosList();

//        wywolajKolejkaList();

        wywolajONP();
    }

    public static void wywolajONP(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wyrażenie w Odwrotnie Notacji Polskiej:");
        String wejscie = sc.nextLine();

        String[] podzial = wejscie.split("");

        new ONP().run(podzial);
    }

    public static void wywolajKolejkaList(){
        KolejkaList kolejkaList = new KolejkaList();

        kolejkaList.add(1);
        kolejkaList.add(2);
        kolejkaList.add(3);

        System.out.println("peek: " + kolejkaList.peek());

        kolejkaList.poll();
        kolejkaList.poll();

        kolejkaList.add(4);
        kolejkaList.add(5);

        System.out.println("KONIEC");
    }

    public static void wywolajStosList(){
        StosList stosList = new StosList();

        stosList.push(1);
        stosList.push(2);
        stosList.push(3);

        stosList.show();

        try {
            stosList.pop();
        }catch (StosListIndexOutException e){
            System.out.println(e.getMessage());
        }

        stosList.show();

        stosList.push(4);
        stosList.push(5);

        stosList.show();

        try {
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
            stosList.pop();
        }catch (StosListIndexOutException e){
            System.out.println(e.getMessage());
        }


        stosList.show();

        System.out.println("KONIEC");
    }

//    public static void wywolajStosTab(){
//        Scanner sc = new Scanner(System.in);
//        int tab[];
//        int rozmiar;
//
//
//        System.out.println("Podaj rozmiar tablicy");
//        rozmiar = sc.nextInt();
//        tab = new int[rozmiar];
//
//
//        System.out.println("Podaj elementy tablicy");
//        while (true){
//            System.out.println("1 - push; 2 - pop; 3 - peek; 4 - show;0 - wyjscie");
//            int operacja = sc.nextInt();
//
//            switch (operacja){
//                case 0:
//                    return;
//                case 1:
//                    System.out.println("Podaj wartosc na stos:");
//                    int w = sc.nextInt();
//                    try {
//                        stos.push(w);
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Tablica pełna");
//                    }
//                    break;
//                case 2:
//                    try {
//                        System.out.println("Pop " + stos.pop());
//                    }catch (ArrayIndexOutOfBoundsException e){
//                        System.out.println("Tablica pusta!");
//                    }
//                    break;
//                case 3:
//                    System.out.println("Peek " + stos.peek());
//                    break;
//                case 4:
//                    stos.show();
//                    break;
//            }
//        }
//    }



}
