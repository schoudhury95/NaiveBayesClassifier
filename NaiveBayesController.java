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
        NBV.getTrainingButton().addActionListener(e -> setTrainValueFromField());

    }

    private void setTrainValueFromField(){
        /* <=== The point is to create a training value straight from the JTextField ===>*/
        String text = NBV.getTrainingTextField().getText();
        JOptionPane.showMessageDialog(null,text);
    }
}
