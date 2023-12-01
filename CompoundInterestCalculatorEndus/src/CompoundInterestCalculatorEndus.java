// by endus

import javax.swing.JOptionPane;
public class CompoundInterestCalculatorEndus

{

    public static void main(String[] args)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the Compound Interest Calculator! "
                + "Before you start, be sure to ONLY input numbers to get a proper result.");
        String monthlysavingsamountString
                = JOptionPane.showInputDialog(null,
                        "Enter your monthly savings amount",
                        "Compound Interest Calculator",
                        JOptionPane.QUESTION_MESSAGE);
        double monthlysavingsamount = Double.parseDouble(monthlysavingsamountString);

        String annualpercentageString
                = JOptionPane.showInputDialog(null,
                        "Enter your annual percentage",
                        "Compound Interest Calculator",
                        JOptionPane.QUESTION_MESSAGE);
        double annualpercentage = Double.parseDouble(annualpercentageString);
        double monthlyrate = annualpercentage / 100 / 12;

        String monthcountString
                = JOptionPane.showInputDialog(null,
                        "Enter the number of months you want to save for",
                        "Compound Interest Calculator",
                        JOptionPane.QUESTION_MESSAGE);
        int monthcount = Integer.parseInt(monthcountString);
       
        double finalsavings = 0;
        for (int i = 1; i <= monthcount; i++)
        {
            finalsavings = (finalsavings + monthlysavingsamount) * (1 + monthlyrate);
        }
        String formattedinput = String.format("Your final savings will be: $%,.2f", finalsavings);
        JOptionPane.showMessageDialog(null, formattedinput);
    }
}
