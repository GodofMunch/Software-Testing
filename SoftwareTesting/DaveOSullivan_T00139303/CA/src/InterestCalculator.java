import javax.swing.JOptionPane;

public class InterestCalculator {
	public static void main(String[] args) {
		
		double monthly;
		double rate;
		int years;
		int amount;
		double total;
		
		years = Integer.parseInt(JOptionPane.showInputDialog("How Many Years?"));
		rate = Double.parseDouble(JOptionPane.showInputDialog("Interest Rate?"));
		amount = Integer.parseInt(JOptionPane.showInputDialog("Whats the Amount?"));
		double monthlyRate = rate / 12;
		monthly = amount * (Math.pow(monthlyRate * (1-monthlyRate), years*12)/Math.pow((1 + monthlyRate), years*12) - 1);

		total = monthly * (years * 12);
		
		//monthly = total / (12 * years);
		
		JOptionPane.showMessageDialog(null, "Total = " + total + "\nMonthly = " + monthly);
		
		System.exit(0);
	}
}