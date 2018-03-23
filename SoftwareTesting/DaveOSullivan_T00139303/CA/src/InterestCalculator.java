import javax.swing.JOptionPane;

public class InterestCalculator {

	public static void main(String[] args) {
		double amount = Double.parseDouble(JOptionPane.showInputDialog("Please enter amount"));
		double rate = Double.parseDouble(JOptionPane.showInputDialog("please enter percentage"));
		int years = Integer.parseInt(JOptionPane.showInputDialog("How many years"));

		calcLoan(years, amount, rate);
	}
	public static double[] calcLoan(int years, double amount, double rate){

		double monthly;
		double total;
		double monthlyRate = (rate / 12)/100;

		monthly = (amount * monthlyRate) / (1 - Math.pow(1 / (1 + monthlyRate),(years * 12)));
		total = monthly * (years * 12);

		JOptionPane.showMessageDialog(null, "Total = " + total + "\nMonthly = " + monthly);

		double[] costs = new double[2];
		costs[0] = monthly;
		costs[1] = total;

		return costs;
    }
}