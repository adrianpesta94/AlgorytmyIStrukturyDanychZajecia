package Zadania;

public class Algorytmy {

    private int[] tab = {1, 2, 3, 9, 4, 5};

    public boolean sortuj() {
        for (int i = 1; i < tab.length - 1; i++) {
            if (tab[i] < (tab[i - 1])) {
                return false;
            }
        }
        return true;
    }
}
