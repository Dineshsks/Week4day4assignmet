package Bank;

public class Axisbank extends Bankinfo {
public void deposit() {
	System.out.println(" axis deposited");
}
public static void main(String[] args) {
	Axisbank bank=new Axisbank();
	bank.deposit();
}
}
