import javax.swing.*;

public class gameframe extends JFrame {
    gameframe(){
   this.add(new gamepanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
    }

}
