/**
 * Created by Subhodeep on 10/28/2016.
 */
public class RunNaiveBayesApp {
    public static void main(String[] args) {

        NaiveBayesView NBV = new NaiveBayesView();
        NaiveBayesClassifier NBM = new NaiveBayesClassifier();
        NaiveBayesController NBC = new NaiveBayesController(NBV, NBM);


        NBV.setVisible(true);
    }
}
