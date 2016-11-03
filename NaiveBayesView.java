import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Subhodeep on 10/27/2016.
 */
public class NaiveBayesView extends JFrame {
    public JPanel NBpanel;
    private JTextField writeNameOfTrainingTextField = new JTextField(20);
    private JButton trainButton = new JButton("Train");
    private JButton testButton = new JButton("Test");
    private JFormattedTextField accuracyUpdatedHereFormattedTextField = new JFormattedTextField(10);
    private JButton getAccuracyButton = new JButton("Get Accuracy");
    private JTextField writeNameOfTestingTextField = new JTextField(20);

    NaiveBayesView() {

        NBpanel = new JPanel();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(600, 800);
        NBpanel.add(writeNameOfTrainingTextField);
        NBpanel.add(trainButton);
        NBpanel.add(testButton);
        NBpanel.add(accuracyUpdatedHereFormattedTextField);
        NBpanel.add(getAccuracyButton);
        NBpanel.add(writeNameOfTestingTextField);

        this.add(NBpanel);

        trainButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "HelloWorld!");
            }
        });

    }

}
