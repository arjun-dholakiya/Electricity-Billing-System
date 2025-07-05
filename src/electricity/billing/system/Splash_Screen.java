package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash_Screen extends JFrame {
    Splash_Screen(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/Splash/Splash.jpg"));
        Image imageOne = imageIcon.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2 = new ImageIcon(imageOne);
        JLabel imageLabel = new JLabel(imageIcon2);
        add(imageLabel);

        setSize(600,400);
        setLocation(500,200);
        setTitle("Splash Screen");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Only 3sec Screen Is Visible
        try{
            Thread.sleep(5000);
            setVisible(false);
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        new Splash_Screen();
    }
}
