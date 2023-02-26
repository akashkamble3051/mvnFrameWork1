package javaEncapsulation;

class BankAccount {
	private int accNum;
	private double accBalance;
	private static String bankName;

	public int getAccNum() {
		return accNum;
	}

	public void setAccNum(int accNum) {
		this.accNum = accNum;
	}

	public double getAccBalance() {
		return accBalance;
	}

	public void setAccBalance(double accBalance) {
		this.accBalance = accBalance;
	}

	public static String getBankName() {
		return bankName;
	}

	public static void setBankName(String bankName) {
		BankAccount.bankName = bankName;
	}

}

public class Encapsulation2 {
	public static void main(String[] args) {
		BankAccount obj = new BankAccount();

		obj.setAccNum(23544);
		System.out.println(obj.getAccNum());

		obj.setAccBalance(3000.0);
		System.out.println(obj.getAccBalance());

		BankAccount.setBankName("ABC Banks ltd");
		System.out.println(BankAccount.getBankName());
	}
}
