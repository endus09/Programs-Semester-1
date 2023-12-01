// By endus

/* This is a program where you can enter the first 9 digits of an ISBN-10 number and it will calculate a checksum using this formula:
( (1* d1) + (2 * d2) + (3 * d3) + (4 * d4) + (5 * d5) + (6 * d6) + (7 * d7) + (8 * d8) + (9 * d9) ) % 11 */

import javax.swing.JOptionPane;

public class ISBN10ChecksumEndus 
{

    public static void main(String[] args)
    {
        boolean wantsToContinue = true;

        while (wantsToContinue)
        {
            String isbn = JOptionPane.showInputDialog("Enter the first 9 digits of an ISBN number:");

            int sum = 0;

            for (int i = 0; i < isbn.length(); i++)
            {
                int number = Character.getNumericValue(isbn.charAt(i));
                sum += number * (i + 1);
            }
            int digit10 = sum % 11;
            if (digit10 < 10)
            {
                JOptionPane.showMessageDialog(null, "The ISBN-10 number is: " + isbn + digit10);
                System.out.println(isbn + digit10);
            } else
            {
                JOptionPane.showMessageDialog(null, "The ISBN-10 number is: " + isbn + "X");
                System.out.println(isbn + ("X"));
            }
            int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to enter another?", "Perchance", JOptionPane.YES_NO_OPTION);

            if (dialogButton == JOptionPane.YES_OPTION)
            {
                wantsToContinue = true;
            } else if (dialogButton == JOptionPane.NO_OPTION)
            {
                wantsToContinue = false;
            }
        }
    }
}
