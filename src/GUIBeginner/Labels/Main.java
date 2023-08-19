package GUIBeginner.Labels;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        ImageIcon image = new ImageIcon("GUIBeginner/ICONS/BackArrow.png");
        Border border =  BorderFactory.createLineBorder(Color.GREEN, 3);
        JLabel label = new JLabel();//create a label
        label.setText("Hey baby gal");//set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER);//set text, left, centre or right of image icon
        label.setVerticalTextPosition(JLabel.TOP);//set test, top, centre, bottom of image icon
        label.setForeground(new Color(0x00FF00));//set font color of text
        label.setFont(new Font("MV Boli", Font.PLAIN, 20));// set font of text
        label.setIconTextGap(5);//set gap of text to image
        label.setBackground(Color.BLACK);//set background color
        label.setOpaque(true);//display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);//set vertical position of icon + text within the label
        label.setHorizontalAlignment(JLabel.CENTER);//set position of text
        //label.setBounds(0,0,250,250);//set x, y position within frame as well as dimension

        JFrame frame = new JFrame();
        frame.setTitle("Ian's Coding zone");
        //frame.setSize(500, 500);
        //frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
       // frame.getContentPane().setBackground(new Color(34, 45,90));
        frame.setVisible(true);
        frame.add(label);
        frame.pack();//resize the frame according to components
    }
}
