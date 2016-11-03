/**
 * Created by Subhodeep on 10/28/2016.
 */
public class NaiveBayesController {
    private NaiveBayesView NBV;
    private NaiveBayesClassifier NBC;

    public NaiveBayesController(NaiveBayesView NBV, NaiveBayesClassifier NBC) {
        this.NBC = NBC;
        this.NBV = NBV;
    }
}
