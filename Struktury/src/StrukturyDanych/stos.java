package StrukturyDanych;

public class stos {

    private int tab[];
    private int top;

    public stos(int rozmiar){
        tab = new int[rozmiar];
        top = -1;
    }

    public void push(int wart) throws ArrayIndexOutOfBoundsException{
//        wersja I
//        top = top + 1;//top++
//        tab[top] = wartosc;

//        wersja II
        tab[++top] = wart;
    }

    public int pop() throws ArrayIndexOutOfBoundsException{
//        wersja I
//        return tab[top];
//        top - top + 1;

//        wersja II
        if (isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        return tab[top--];
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == tab.length - 1;
    }

    public int peek(){
        return tab[top];
    }

    public void show(){
        for (int i = 0; i <= top; i++){
            System.out.print(tab[i] + " ");
        }
        System.out.println();
    }
}
