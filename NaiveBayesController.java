import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Subhodeep on 10/28/2016.
 */
public class NaiveBayesController {
    private NaiveBayesView NBV;
    private NaiveBayesClassifier NBM; // Naive Bayes Model

//    Somehow this class needs all the action listeners
    public NaiveBayesController(NaiveBayesView NBV, NaiveBayesClassifier NBM) {
        this.NBM = NBM;
        this.NBV = NBV;
    }

    public void init() {
        /*<===  set up the listeners below ===>*/
//        get the buttons
        NBV.getTrainingButton().addActionListener(e -> setTrainFileFromField());
        NBV.getTestButton().addActionListener(e -> setTestValueFromField());
        NBV.getAccuracyButton().addActionListener(e -> setAccuracyValueFromModel());
    }

    private void setTrainFileFromField() {
        /* <=== The point is to create a training value straight from the JTextField ===>*/
        JOptionPane.showMessageDialog(null,NBV.getTrainingTextField().getText());
    }

    private void setTestValueFromField() {
        /* <=== The point is to create a test value straight from the JTextField ===>*/
        JOptionPane.showMessageDialog(null, NBV.getTestFile().getText());
    }

    private void setAccuracyValueFromModel(){
        /* <=== The point is to update the accuracy straight from the Model ===>*/
        NBV.setAccuracy(Double.toString(NBM.getAccuracy())); // set accuracy of the view to the accuracy of the model
    }
}
