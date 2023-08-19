package GUIBeginner.Basics;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("New to Frames");//sets title of frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit out of the application
        this.setResizable(false);//frame can not be resized
        this.setSize(420, 420);//sets x and y dimensions
        this.setVisible(true);// set frame visible

        ImageIcon image = new ImageIcon("BackArrow.png");//create an image icon
        this.setIconImage(image.getImage());//change icon of frame
       // frame.getContentPane().setBackground(Color.CYAN);//change color of background
        this.getContentPane().setBackground(new Color(123, 50,250));

    }
}
