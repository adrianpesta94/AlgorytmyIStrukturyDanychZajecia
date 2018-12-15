package algorytmy;

import StrukturyDanych.stos;

public class ONP{

    public void run(String tab[]){
        stos stosTab = new stos(tab.length);
        for (int i = 0; i < tab.length; i++){
            try {
                int wartosc = Integer.parseInt(tab[i]);
                stosTab.push(wartosc);
            }catch (NumberFormatException e){
                int wartosc1 = stosTab.pop();
                int wartosc2 = stosTab.pop();

                String operacja = tab[i];

                int wynik = 0;

                if (operacja.equals("+")){
                    wynik = wartosc2 + wartosc1;
                } else if (operacja.equals("-")){
                    wynik = wartosc2 - wartosc1;
                } else if (operacja.equals("*")){
                    wynik = wartosc2 * wartosc1;
                } else if (operacja.equals("/")){
                    wynik = wartosc2 / wartosc1;
                }else {
                    return;
                }

                stosTab.push(wynik);
            }
        }

        System.out.println(stosTab.pop());
    }

}
