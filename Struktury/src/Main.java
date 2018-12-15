import algorytmy.ONP;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[] tab = {1,2,3,4,5,6};
//        for (int i = tab.length-1; i >= 0; i--){
//            if (tab[i] % 2 == 0 ){
//                System.out.println(tab[i]);
//            }
//        }
//        int suma = 0;
//        for (int i = 0; i < tab.length; i++){
//            if (tab[i] % 3 == 0){
//                suma += tab[i];
//                System.out.println(suma);
//            }
//        }

        int i = 10;
        int n = 10;

        for (i = 1; i < n; i++) {
            System.out.println("Sprawdź gita");
        }
        System.out.println();

        wywolajONP();
    }
    public static void wywolajONP(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wyrażenie w Odwrotnie Notacji Polskiej:");
        String wejscie = sc.nextLine();

        String[] podzial = wejscie.split("");

        new ONP().run(podzial);
    }
}
