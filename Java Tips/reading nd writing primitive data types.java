/*
 * Reading and writing primitive data. 
 * By: Nkgolo Lebelo 
 * 2018 Notes 
 */
 
 void writePrimitives(String fOutName) throws IOException {
	 DataOutputStream fOut = new DataOutputStream(new FileOutputStream(fOutName));
	 fOut.writeBoolean(5<6);
	 fOut.writeChar('A');
	 fOut.writeDouble(1.2);
	 fOut.writeFloat(3.4f);
	 fOut.writeShort(56);
	 fOut.writeInt(78);
	 fOut.writeLong(1852);
	 fOut.writeFloat(3.4f);
	 fOut.writeByte(' * ');
	 fOut.writeUTF("abc");
	 fOut.close();
	   
   }

void readPrimitives(String fInName) throws IOException {
	   DataInputStream fIn = new DataInputStream( new FilInputStream(fInName));
	   System.out.println(fIn.readBoolean() + " " + fIn.readCha() + " " fIn.readDouble() +
	   " " + fIn.readFloat() + " " + fIn.readShort() + " " fIn.readInt() + " " 
	   fIn.readLong() + " " fIn.readBytes() + " " fIn.readUTF());
	   fIn.close();
   }
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	 
