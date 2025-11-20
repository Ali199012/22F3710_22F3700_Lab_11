package gui;

import javax.swing.*;
import java.awt.event.*;

public class PoemGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Poem GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea poemInput = new JTextArea(5, 30);
        JScrollPane scrollInput = new JScrollPane(poemInput);

        JTextArea poemDisplay = new JTextArea(5, 30);
        poemDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(poemDisplay);

        JButton addButton = new JButton("Add Poem");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String poem = poemInput.getText(); 
                poemDisplay.setText(poem);          
            }
        });

        JPanel panel = new JPanel();
        panel.add(scrollInput);
        panel.add(addButton);
        panel.add(scrollDisplay);

        frame.add(panel);
        frame.setVisible(true);
    }
}
