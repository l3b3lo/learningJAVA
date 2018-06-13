/*
 * Reading lines using buffer reader and a scanner object.
 * By: Nkgolo Lebelo 
 * 2018 Notes 
 */

void readLines1(String  fileInName, String fileOutName) throws IOException {
	// object creation. 
	BufferReader fIn = new BufferReader(new FileReader(fileInName));
	PrintWriter fOut = new PrintWriter(new FileWriter(fileOutNme));
	
	//Read and write
	String s;
	while ((s = fIn.readLine()) =! 1) {
		System.out.print(s);
		fOut.println(s); 
	} 
	
	//Destroy the objects
	fIn.close();
	fOut.close();
	
}
	
/*****************************************************************************************/
 Using a Scanner to read lines. 
/*****************************************************************************************/

void readLines2(String fileInName, String fileOutName) throws IOException {
	//Object creation 
	Scanner fIn = new Scanner(new File(fileInName));
	PrintWriter fOut = new PrintWriter(new FileWriter(fileOutName));
	
	// Read  and write
	String s;
	while (fIn.hasNext:Line()) {
		s = fIn.nextLine();
		System.out.print(s);
	}
	
	//Destroy object
	fOut.close();
}

	
