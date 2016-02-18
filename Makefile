all:
	javac NaiveBayesClassifier.java
run:
	java NaiveBayesClassifier testing.txt testing.txt > output.txt
clean:
	rm NaiveBayesClassifier.class output.txt
execute:
	java NaiveBayesClassifier training.txt testing.txt | java -jar validate.jar
