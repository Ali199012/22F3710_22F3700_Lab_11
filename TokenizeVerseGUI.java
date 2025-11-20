package gui;

import javax.swing.*;
import java.awt.event.*;

public class TokenizeVerseGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tokenize Verse");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextArea verseInput = new JTextArea(5, 30);
        JScrollPane scrollInput = new JScrollPane(verseInput);

        JTextArea tokensDisplay = new JTextArea(5, 30);
        tokensDisplay.setEditable(false);
        JScrollPane scrollDisplay = new JScrollPane(tokensDisplay);

        JButton tokenizeButton = new JButton("Tokenize");
        tokenizeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String verse = verseInput.getText();
                String[] tokens = verse.split("\\s+"); 
                String result = String.join("\n", tokens);
                tokensDisplay.setText(result);
            }
        });

        JPanel panel = new JPanel();
        panel.add(scrollInput);
        panel.add(tokenizeButton);
        panel.add(scrollDisplay);

        frame.add(panel);
        frame.setVisible(true);
    }
}
