package MainApplication.UI;

import javax.swing.*;

public class MainFrame extends JFrame {
    final protected String fontFamily;
    public MainFrame() {
        fontFamily = "SansSerif";
        this.setSize(600, 700);
        this.setLocationRelativeTo(null);
    }

    public void showNotification(String title, String message, boolean warning) {
        if (warning)
            JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
        else
            JOptionPane.showMessageDialog(this, message, title, JOptionPane.PLAIN_MESSAGE);
    }
}
