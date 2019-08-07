package proxy;

import java.io.IOException;

import builder.BankAccount;

public interface FileInterface {
	
	public void writeOutputToFile(BankAccount bankAccount) throws IOException;
}
