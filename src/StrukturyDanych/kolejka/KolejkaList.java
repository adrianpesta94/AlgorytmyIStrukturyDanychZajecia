package StrukturyDanych.kolejka;

public class KolejkaList {

    KolejkaElem first;
    KolejkaElem last;

    public KolejkaList(){
        first = last = null;
    }

    public void add(int wartosc){
        KolejkaElem newLastElem = new KolejkaElem(wartosc, null);
        if (first != null){
            first = newLastElem;
        } else {
            last.setNext(newLastElem);
            first = last = newLastElem;
        }
    }

    public int poll(){
        int value = first.getValue();
        last = last.getNext();
        return value;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public int peek(){
        return first.getValue();
    }

    public void show(){
        KolejkaElem elemTmp = first;

        while (elemTmp != null) {
            System.out.print(elemTmp.getValue() + " ");
            elemTmp.getNext();
        }
        System.out.println();
    }
}
