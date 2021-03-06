/**
 * 
 */
package proxy;

import java.io.IOException;

import builder.BankAccount;

/**
 * @author Sutirtha
 *
 */
public class FileInterfaceProxy implements FileInterface {
	
	private BankAccount bankAccount;
	private FileInterfaceImpl fileInterfaceImpl;
	
	public  FileInterfaceProxy(BankAccount bankAccount) {
		// TODO Auto-generated constructor stub
		this.setBankAccount(bankAccount);
		if(fileInterfaceImpl == null){
		fileInterfaceImpl = new FileInterfaceImpl();
		}
	}
	
	
	
	/* (non-Javadoc)
	 * @see proxy.FileInterface#writeOutputToFile(java.lang.String)
	 */
	@Override
	public void writeOutputToFile(BankAccount bankAccount) throws IOException {
		if(bankAccount.isNewsLetter())
			fileInterfaceImpl.writeOutputToFile(bankAccount);
		else
			System.out.println("Ineligible To write file");

	}



	/**
	 * @return the bankAccount
	 */
	public BankAccount getBankAccount() {
		return bankAccount;
	}



	/**
	 * @param bankAccount the bankAccount to set
	 */
	public void setBankAccount(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}

}
