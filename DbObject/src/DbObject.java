
import java.io.*;

public class DbObject {
	java.util.Scanner  kb = new java.util.Scanner(System.in);
	
	public void writeString(String s, RandomAccessFile out) throws IOException {
		for(int i = 0; i  < s.length(); i++) {
			out.writeChar(s.charAt(i));
		}
	}
	
	public String readString(int len, RandomAccessFile out) throws IOException {
		StringBuffer s = new StringBuffer(len);
		for (int i = 0; i < len ; i++) {
			s.append(in.readChar());
		}
		return s.toString();
		}
	
	abstract public void writeToFile(RandomAccessFile out) throws IOException;
	abstract public void readFromFile(RandomAccessFile in);
	abstract public void ();
	abstract public void ();
	abstract public void ();
	abstract public void ();
	abstract public void ();
	

}
