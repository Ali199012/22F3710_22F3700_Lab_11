package gui;

import javax.swing.*;
import java.awt.event.*;

public class AssignRootsGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Assign Roots to Verse");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea verseInput = new JTextArea(5, 30);
        JScrollPane scrollInput = new JScrollPane(verseInput);

        JTextArea rootsDisplay = new JTextArea(5, 30);
        rootsDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(rootsDisplay);

        JButton assignButton = new JButton("Assign Roots");
        assignButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String verse = verseInput.getText();
                String roots = "";

                for (String word : verse.split(" ")) {
                    roots += word.toLowerCase() + " ";
                }

                rootsDisplay.setText(roots.trim());
            }
        });

        JPanel panel = new JPanel();
        panel.add(scrollInput);
        panel.add(assignButton);
        panel.add(scrollDisplay);

        frame.add(panel);
        frame.setVisible(true);
    }
}
