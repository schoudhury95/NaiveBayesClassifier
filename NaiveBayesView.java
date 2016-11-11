import javax.swing.*;

/**
 * Created by Subhodeep on 10/27/2016.
 */
public class NaiveBayesView extends JFrame {
    public  JPanel NBpanel;
    private JTextField trainFileField;
    private JButton trainButton;
    private JButton testButton;
    private JFormattedTextField accTextField;
    private JButton accuracyButton;
    private JTextField testFileField;

    public JButton getAccuracyButton() {
        return this.accuracyButton;
    }

    public NaiveBayesView() {
//        Kept Here for anything we may need to initialize
        accTextField.setEnabled(false);
    }

    public JButton getTrainingButton() {
        return this.trainButton;
    }

    public JTextField getTrainingTextField(){
        return this.trainFileField;
    }

    public JButton getTestButton() {
        return this.testButton;
    }

    public JTextField getTestFile() {
        return this.testFileField;
    }

    public boolean setAccuracy(String acc){
        accTextField.setText(acc);
        if(accTextField.getText() == acc)
            return true;
        else
            return false;
    }

}
