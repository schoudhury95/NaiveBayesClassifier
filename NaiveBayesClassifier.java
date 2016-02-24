import java.io.*;
import java.util.regex.*;
import java.util.*;

class NaiveBayesClassifier{

	private static int sentiment;
	private static String review;

	public static void main(String[] args) throws IOException{
		List<Integer> r = new ArrayList<Integer>(); // trainig set
		List<Integer> s = new ArrayList<Integer>(); // testing set
		List<Integer> c1 = new ArrayList<Integer>(); // testing set
		List<Integer> c2 = new ArrayList<Integer>(); // testing set


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
								r.add(sentiment);
								c1.add(model.classify(review));
            }
        }

		//model.printModel();

		// closes the buffered reader for a new input
        br.close();


		// set things up to test the bayesian model
		br = new BufferedReader(new FileReader(args[1]));

		System.out.println(model.classify("Bromwell High is a cartoon comedy. It ran at the same time as some other programs about school life, such as \"Teachers\". My 35 years in the teaching profession lead me to believe that Bromwell High's satire is much closer to reality than is \"Teachers\". The scramble to survive financially, the insightful students who can see right through their pathetic teachers' pomp, the pettiness of the whole situation, all remind me of the schools I knew and their students. When I saw the episode in which a student repeatedly tried to burn down the school, I immediately recalled ......... at .......... High. A classic line: INSPECTOR: I'm here to sack one of your teachers. STUDENT: Welcome to Bromwell High. I expect that many adults of my age think that Bromwell High is far fetched. What a pity that it isn't!"));

		int count;
		int match;
		/*** TODO: use Bayesian Model Here, and Dynamically update accuracy ***/
        while (null != (line = br.readLine())) {
            Matcher m = p.matcher(line);
            if (m.matches()) {
								sentiment = Integer.parseInt(m.group(1));
								review = m.group(2);
								s.add(sentiment);
                c2.add(model.classify(review));
            }
            //System.out.println();
        }

		// closes the buffered reader permanently
        br.close();

		/*** TODO: print accuracy calculations below and format output correctly ***/
		// check the pdf for more info on how to do this
		/**
			The psuedocode:
			if link1 == link2 then count up with acc++

			finally acc/total;
		**/
		Integer[] sArr = new Integer[s.size()];
		Integer[] rArr = new Integer[r.size()];

		s.toArray(sArr);
		r.toArray(rArr);

		int acc,i;
		acc = 0;
		i = 0;
		for(int t : c2){
			System.out.println(t);
			if(t == sArr[i]){
				acc++;
			}
			i++;
		}
		double accuracy1 = acc/(double)i;

		i = 0;
		acc = 0;
		for(int t : c1){
			if(t == rArr[i]){
				acc++;
			}
			i++;
		}
		double accuracy2 = acc/(double)i;

		System.out.println(accuracy2 + " (training)");
		System.out.println(accuracy1 + " (testing)");

	}
}
