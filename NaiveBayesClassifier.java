import java.io.*;
import java.util.regex.*;
import java.util.*;

class NaiveBayesClassifier{
	
	private static int sentiment;
	private static String review;

	public static void main(String[] args) throws IOException{
		List<Integer> test = new ArrayList<Integer>();

		// set up a model then do the TODOs
		Model model = new Model();

		// below sets up the buffered reader for training set
        BufferedReader br = new BufferedReader(new FileReader(args[0]));

		// below is the pattern needed to parse in doc correctly
        Pattern p = Pattern.compile("(\\d)\t(.+?)");

		// place holder string to match each line
        String line;
		
		// below reads through all the lines and prints out the rating and reviews
		// use the statements below to make your bayesian model

        while (null != (line = br.readLine())) {
            Matcher m = p.matcher(line);
            if (m.matches()) {
                sentiment = Integer.parseInt(m.group(1));
                review = m.group(2);
				model.insertDoc(review, sentiment);
            }
        }

		//model.printModel();

		// closes the buffered reader for a new input
        br.close();


		// set things up to test the bayesian model
		br = new BufferedReader(new FileReader(args[1]));



		/*** TODO: use Bayesian Model Here, and Dynamically update accuracy ***/
        while (null != (line = br.readLine())) {
            Matcher m = p.matcher(line);
            if (m.matches()) {
                String rating = m.group(1);
                String review = m.group(2);

                //System.out.println("rating:  " + rating);
                //System.out.println("review: " + review);
            }
            //System.out.println();
        }

		// closes the buffered reader permanently
        br.close();

		/*** TODO: print accuracy calculations below and format output correctly ***/
		// check the pdf for more info on how to do this

		
		

	}
}
