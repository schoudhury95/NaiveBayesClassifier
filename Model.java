import java.util.HashMap;


class Model {
	public static int posTotal;
	public static int negTotal;
	public static HashMap<String, Word> bag;

	public Model(){
		posTotal = 0;
		negTotal = 0;
		bag = new HashMap<String, Word>();
	}

	public static void insertDoc(String rev, int sentiment){
	//COMPLETED
		Parser parser = new Parser();
		String[] words = null;

		if(sentiment == 0){
			negTotal++;
		}else{
			posTotal++;
		}
		/*pseudocode:
			string[] words = parser.parseReview(rev);
			loop through words:
				check if hash map has word as a key
					if yes: then increment sentiment passed in
					if no: then insert the word with given sentiment
		*/
		Word testKeyVal = new Word();
		words = parser.parseReview(rev);
		for(String word : words){
			testKeyVal = bag.get(word);
			if(testKeyVal != null){ // there exist word in bag
				if(sentiment == 0){
					testKeyVal.neg++;
					bag.put(word, testKeyVal);
				}else{
					testKeyVal.pos++;
					bag.put(word, testKeyVal);
				}
			}else{ // no word in bag // make new word
				testKeyVal = new Word();
				testKeyVal.lexeme = word;
				if(sentiment == 0){
					testKeyVal.neg++;
					bag.put(word, testKeyVal);
				}else{
					testKeyVal.pos++;
					bag.put(word, testKeyVal);
				}
			}
		}
		
	}
	
	public static void printModel(){
		for(Word i : bag.values()){
			System.out.println("This is word: " + i.lexeme + " pos: " + i.pos + " neg: " + i.neg);
		}
	}
	public static int classify(String rev){
		int sentiment = -1;
		double p1 = 1.0;
		double p0 = 1.0;
		//TODO: classify by bayesian classification: really mathsy stuff;
			
		if(posTotal!=0 || negTotal!=0){
			p1 = posTotal/((double)(posTotal + negTotal)); //sentiment = 1 prob
			p0 = posTotal/((double)(posTotal + negTotal)); //sentiment = 1 prob
		}
		// get P(class == 1| key1, key2 ... key n) By P(key1|class = 1)
		// assumption is sentiment 1
		Word testKeyVal = null;
		String[] keys = Parser.parseReview(rev);
		for(String key : keys){
			testKeyVal = bag.get(key);
			if(testKeyVal != null){ // there exist word in bag
				if(testKeyVal.pos != 0){
					p1 *= testKeyVal.pos/(double)posTotal;
				}
			}
		}

		for(String key : keys){
			testKeyVal = bag.get(key);
			if(testKeyVal != null){ // there exist word in bag
				if(testKeyVal.neg != 0){
					p0 *= testKeyVal.neg/(double)negTotal;
				}
			}
		}
		
		System.out.println("this is p1 : " + p1);
		System.out.println("this is p0 : " + p0);

		if(p1 > p0){
			sentiment = 1;
		}else{
			sentiment = 0;
		}

		return sentiment;
	}
}
