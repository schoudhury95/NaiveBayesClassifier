import java.util.*;
import java.io.*;
import java.util.regex.*;

class Parser {

	public static String[] parseReview (String rev) {
	//COMPLETED
		String[] ret = null;
		ret = rev.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
		ret = new HashSet<String>(Arrays.asList(ret)).toArray(new String[0]);

		return ret;		
	}
}
