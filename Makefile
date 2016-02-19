all:
	javac *.java
run:
	java NaiveBayesClassifier training.txt testing.txt #> output.txt
clean:
	rm *.class output.txt
execute:
	java NaiveBayesClassifier training.txt testing.txt | java -jar validate.jar
