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
		
		total=amount;
		rate = rate/100f;
		for(int i = 1; i <= years; i++) {
			total += (amount * rate);
		}
		
		
		monthly = total / (12 * years);
		
		JOptionPane.showMessageDialog(null, "Total = " + total + "\nMonthly = " + monthly);
		
		System.exit(0);
	}
}