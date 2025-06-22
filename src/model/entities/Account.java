	package model.entities;
	
	import model.exceptions.BusinessException;
	
	public class Account {
		public Integer number;
		public String holder;
		public Double balance;
		public Double withdrawLimit;
		
		public Account() {
		}
	
		public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
			super();
			this.number = number;
			this.holder = holder;
			this.balance = balance;
			this.withdrawLimit = withdrawLimit;
		}
	
		public Integer getNumber() {
			return number;
		}
	
		public void setNumber(Integer number) {
			this.number = number;
		}
	
		public String getHolder() {
			return holder;
		}
	
		public void setHolder(String holder) {
			this.holder = holder;
		}
	
		public Double getBalance() {
			return balance;
		}
	
		public Double getWithdrawLimit() {
			return withdrawLimit;
		}
	
		public void setWithdrawLimit(Double withdrawLimit) {
			this.withdrawLimit = withdrawLimit;
		}
		
		public void deposit(double amount) {
			balance += amount;
		}
		
		public void withdraw(double amount) throws BusinessException{
			accountChecker(amount);
			balance -= amount;
		}
		
		public void accountChecker(double amount) throws BusinessException {
			if(amount > withdrawLimit) {
				throw new BusinessException ("Withdraw error: The amount exceeds withdraw limit");
			}
			if(amount > balance) {
				throw new BusinessException ("Withdraw error: Not enough balance");
			}
		}
		
	}
