package model;

public class Electronic {
    private Boolean on = false;
    private Boolean off = true;

    public void getOn() {
        if (on){
            System.out.println("iphone ligado");
        }

    }

    public void setOn(Boolean on) {
        this.on = on;
    }

    public void getOff() {
        if (off){
            System.out.println("iphone desligado");
        }

    }

    public void setOff(Boolean off) {
        this.off = off;
    }
}
