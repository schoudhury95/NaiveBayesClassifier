import javax.swing.*;

/**
 * Created by Subhodeep on 10/28/2016.
 */
public class RunNaiveBayesApp {
    public static void main(String[] args) {

        NaiveBayesView NBV = new NaiveBayesView();
        NaiveBayesClassifier NBM = new NaiveBayesClassifier();
        NaiveBayesController NBC = new NaiveBayesController(NBV, NBM);

        JFrame NBView = new JFrame("NaiveBayesView");
        NBView.setContentPane(new NaiveBayesView().NBpanel);
        NBView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        NBView.pack();
        NBView.setVisible(true);

    }
}
