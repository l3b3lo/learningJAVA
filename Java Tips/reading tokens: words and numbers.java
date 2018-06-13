/*
 * Reading tokens to search for words and number. 
 * By: Nkgolo Lebelo 
 * 2018 Notes 
 */
 
 /*****************************************************************************************/
  Type of tokens are as following
	TT_EOF = end of file.			nextToken() = skips space characters separating tokens.
	TT_EOL = end of line.			sval of type String = contains current token if a word.
	TT_WORD.						nval of type double = contains current token if a num.
	TT_Number.						ttype of type int = contains current token's type.
/*****************************************************************************************/
 
 void readTokens(String inputFileName) throws IOException {
	 StreamTokenizer fIn = new StreamTokenizer(new BufferedReader(
	 new FileReader(inputFileName)));
	 fIn.nextToken();
	 
	 //Read and write
	 String s;
	 while(fIn.ttype =! StreamTokenizer.TT_EOF) {
		 if (fIn.ttpe == StreamTokenizer.TT_WORD)
			 s = "word";
		 else if (fIn.ttype == StreamTokenizer.TT_NUMBER);
			s = "number";
		else s = "other";
		System.out.println(s + " \t " fIn);
		fIn.nextToken();
	}
	
}

/*****************************************************************************************/
 Using a Scanner + Buffer to read lines. 
/*****************************************************************************************/

void readTokens2(String inoutFileName) throws IOException {
	BufferedReader fIn = new BufferedReader(new FileReader(inputFileName));
	String s;
	while ((s = fIn.readLine()) =! null) {
		java.util.StringTokenizer line = new java.util.StringTokenizer(s);
		while (line.hasMoreTokens())
			System.out.println(line.nextToken());
		}
		fIn.close();
	}
	
/*****************************************************************************************/
 Using a Scanner + Buffer to read lines. 
/*****************************************************************************************/

void readTokens(String fInName) throws IOException {
	ScannerfIn = new Scanner(new File(fInName));
	
	while(True) {
		if(fIn.hasNextInt())
			System.out.println("int: " + fIn.nextInt());
		else if (fIn.hasNext())
			System.out.println("word: " + fIn.next());
		else break;
	}
	fIn.close();
}
	
	
	
	
	
	
	
	
