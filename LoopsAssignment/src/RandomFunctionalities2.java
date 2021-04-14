/**
 * Class - RandomFunctionalities2
 *
 * Copyright (c) [2021], Zhao Liu.
 */

public class RandomFunctionalities2 {
	/**
	 * Method returns the first and second word mixed together
	 * @param firstWord: first word to mix
	 * @param secondWord: second to mix
	 * @return: a mixed word
	 */
	public String mixWords(String firstWord, String secondWord) {
		// New string builder mixed
		StringBuilder mixed = new StringBuilder();
		
		// Create a counter
		int i = 0;
		// If the first word is longer
		if (firstWord.length() > secondWord.length()) {
			while (i < secondWord.length()) {
				mixed.append(firstWord.charAt(i));
				mixed.append(secondWord.charAt(i));
				++i;
			}
			mixed.append(firstWord, i, firstWord.length());
		}
		// If the second word is longer
		else {
			while ( i < firstWord.length()) {
				mixed.append(firstWord.charAt(i));
				mixed.append(secondWord.charAt(i));
				++i;
			}
			mixed.append(secondWord, i, secondWord.length());
		}
		return mixed.toString();
	}

	/**
	 * Method returns the word re-arranged by groups of three
	 * @param word: word to be re-arranged
	 * @return: a re-arranged word
	 */
	public String switcheroo(String word) {
		// If the length of the word is less than 3
		if (word.length() < 3) {
			return word;
		}

		// New string builder
		StringBuilder newWord = new StringBuilder();

		for (int i = 0; i < word.length(); i += 3) {
			if ((i + 2) < word.length()) {
				newWord.append(word.charAt(i + 1));
				newWord.append(word.charAt(i + 2));
				newWord.append(word.charAt(i));
			}
			else {
				newWord.append(word, i, word.length());
			}
				
		}

		return newWord.toString();
	}
	
	/**
	 * Method returns the longest set of chars that's repeated at both beginning
	 * and end of a word without overlapping
	 * @param word: input word
	 * @return: longest set of chars
	 */
	public String longestSet(String word) {
		// Create the set, initialized to empty string
		String set = "";

		// Create two counter, i starts from 1, j starts from the word length - 1
		int i = 1;
		int j = word.length() - 1;

		// Loop while i is less than or equal to j
		while (i <= j) {
			// beginStr records the first i chars of word
			String beginStr = word.substring(0, i);
			// endStr records the last j chars of word
			String endStr = word.substring(j, word.length());
			// If beginStr and endStr are equal, assgin beginStr to set
			if (beginStr.compareTo(endStr) == 0) {
				set = beginStr;
			}
			++i;
			--j;
		}

		return set;
	}
}
