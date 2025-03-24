class Summer1b{
	public static void main (String[] args){
		String word1 = args[0]; //aus der Kommandozeile als Argument übergeben!
		String word2 = args[1];
		int wordLength = word1.length() + word2.length();
		System.out.println(wordLength);
	}
}
