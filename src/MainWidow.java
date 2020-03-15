import javax.swing.*;

public class MainWidow extends JFrame {

    public MainWidow() {
        setTitle("Snake");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(480,480);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MainWidow mw = new MainWidow();
    }
}
