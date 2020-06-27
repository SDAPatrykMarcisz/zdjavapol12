package pl.marcisz.patryk.sda.zdjavapol12.enums;

public enum Season {

    SPRING(93),
    SUMMER(93),
    FALL(90),
    WINTER(89);

    private int daysCounter;

    Season(int daysCounter){
        this.daysCounter = daysCounter;
    }

    public int getDaysCounter() {
        return daysCounter;
    }
}
