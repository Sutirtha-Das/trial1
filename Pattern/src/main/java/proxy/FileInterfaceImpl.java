/**
 * 
 */
package proxy;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import builder.BankAccount;

/**
 * @author Sutirtha
 *
 */
public class FileInterfaceImpl implements FileInterface {
	
	public static final String path="C:/Users/Sutirtha/Desktop/output.txt";
	/* (non-Javadoc)
	 * @see proxy.FileInterface#writeOutputToFile(java.lang.String)
	 */
	@Override
	public void writeOutputToFile(BankAccount bankAccount) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw = new FileWriter(path);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(bankAccount.getName());
		bw.newLine();
		bw.flush();
		bw.close();
		fw.close();
		
	}

}
