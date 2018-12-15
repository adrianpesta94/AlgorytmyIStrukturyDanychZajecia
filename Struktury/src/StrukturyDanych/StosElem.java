package StrukturyDanych;

public class StosElem {

    private int value;

    private StosElem prev;

    public StosElem(int value, StosElem prev){
        this.value = value;
        this.prev = prev;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public StosElem getPrev() {
        return prev;
    }

    public void setPrev(StosElem prev) {
        this.prev = prev;
    }


}
