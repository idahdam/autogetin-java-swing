import javax.swing.*;


public class Main{

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JButton button = new JButton("Bangsat");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button.setBounds(130, 100, 100, 40);

        frame.add(button);

        frame.setSize(400, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}