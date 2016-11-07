import javax.swing.*;

/**
 * Created by Subhodeep on 10/27/2016.
 */
public class NaiveBayesView extends JFrame {
    public JPanel NBpanel;
    private JTextField trainingTestField;
    private JButton trainButton;
    private JButton testButton;
    private JFormattedTextField accuracyUpdatedHereFormattedTextField;
    private JButton getAccuracyButton;
    private JTextField writeNameOfTestingTextField;

    public NaiveBayesView() {
//        Kept Here for anything we may need to initialize
    }

    public JButton getTrainingButton() {
        return this.trainButton;
    }

    public JTextField getTrainingTextField(){
        return this.trainingTestField;
    }

}
