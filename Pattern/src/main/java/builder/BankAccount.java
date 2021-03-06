package builder;

public class BankAccount {
	
	private String name;
	private String accountNumber;
	private String email;
	private boolean newsLetter;
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}
	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the newsLetter
	 */
	public boolean isNewsLetter() {
		return newsLetter;
	}
	/**
	 * @param newsLetter the newsLetter to set
	 */
	public void setNewsLetter(boolean newsLetter) {
		this.newsLetter = newsLetter;
	}
	
	private BankAccount(BankAccountBuilder builder){
		this.name = builder.getName();
		this.accountNumber = builder.getAccountNumber();
		this.email = builder.getEmail();
		this.newsLetter = builder.isNewsLetter();
	}
	//Inner Static Builder class
	public static class BankAccountBuilder{
		private String name;
		private String accountNumber;
		private String email;
		private boolean newsLetter;
		
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the accountNumber
		 */
		public String getAccountNumber() {
			return accountNumber;
		}
		/**
		 * @param accountNumber the accountNumber to set
		 */
		public void setAccountNumber(String accountNumber) {
			this.accountNumber = accountNumber;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the newsLetter
		 */
		public boolean isNewsLetter() {
			return newsLetter;
		}
		/**
		 * @param newsLetter the newsLetter to set
		 */
		public void setNewsLetter(boolean newsLetter) {
			this.newsLetter = newsLetter;
		}
		
		public BankAccountBuilder(String name, String accountNumber){
			this.name = name;
			this.accountNumber = accountNumber;
		}
		
		public BankAccountBuilder withEmail(String email){
			this.email = email;
			return this;
		}
		
		public BankAccountBuilder withNewsLetter(boolean wantsNewLetter){
			this.newsLetter = wantsNewLetter;
			return this;
		}
		
		public BankAccount build(){
			return new BankAccount(this);
		}
	}

}
