/*
 * Reading a file using file stream and buffer stream. 
 * By: Nkgolo Lebelo 
 * 2018 Notes 
 */

void readBytes1(String fileName, String fOutName) throws IOException {
	// Create the objects for the input and output file
	FileInputStream fIn = new FileInputStream(fileName);
	FileOutoutStream fOut = new FileOutputStream(fOutName);
	
	int i;
	while ((i = fIn.read()) != -1) {
		System.out.print((char)i + " "); // display the characters it is reading.
		System.out.print(i + " " ); // display the ASCII values it just read.
		fOut.write(i);
	}
	 // Destroy the objects created above. 
	 fIn.close();
	 fOut.close();
 }
 
/*****************************************************************************************/
 An interger variable is used to read the input, and the end of file is indicated by -1
 To make reading and writing more efficient, inpt and output are buffered. 
/*****************************************************************************************/

void readBytes2(String fileName, String fOutName) throws IOException {
	// Creste the objects for the input and output file
	BufferedInputStream fIn = new BufferedInputStream(new FileInputStream(fileName));
	BuffereOutputStream fOut = new BufferedOutputStream(new fileOutputStream(fileName));
	
	int i ;
	while ((i = (fIn.read()) =! -1) {
		System.out.print((char)i + " "); // display the characters it is reading.
		System.out.print(i + " "); // display the ASCII values it just read.
		fOut.write();
	}
	// Destriy the objects created above
	fIn.close();
	fOut.close();
}
