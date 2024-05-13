import model.Iphone;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Iphone iphone4s = new Iphone();
        iphone4s.setOn(true);
        iphone4s.getOn();
        iphone4s.selectMusic();
        iphone4s.play();
        iphone4s.pause();
        iphone4s.call();
        iphone4s.voiceMail();

    }
}