# NaiveBayesClassifier

This is a basic Naive Bayes Classifier for CS 165a project.
The training input must be of the form (//d)\t(.+?)  // in regex

    group(1) is a rating (sentiment of the review)
    group(2) is the actual review

The NaiveBayesClassifier.java is the heart of the project, it goes through: 

    (a) making a model through a training set with the specified regex
	(b) using the model on a training set with specified regex
	(c) printing out the accuracy of model vs actual values


Makefile:
|Command| What it does|
|:---|:---|
|make			|compiles the java file|
|make run		|runs the java file with specific inputs|
|make clean		|cleans up the files that were created by running make|
|make execute	|compares the files that were made with make through a validator // read validate_readme.txt|

That is the basis of the project. For information on the project read MP1.pdf or mp1_presentation.pdf
