// by endus

// This program prompts you to input an integers and then tell you the smallest and the largest integer that was inputted.

import javax.swing.JOptionPane;

public class FindingTheMinAndMaxEndus
{

    public static void main(String[] args)
    {
        int max;
        int min;
        int submission;
        boolean cont;
        boolean i;
        String submissionString;

        cont = true;
        i = false;
        min = 0;
        max = 0;

        while (cont == true)
        {
            submissionString = JOptionPane.showInputDialog("Input an integer");
            submission = Integer.parseInt(submissionString);
            if (i == false)
            {
                max = submission;
                min = submission;
                i = true;
            } else
            {
                if (submission > max)
                {
                    max = submission;
                } else
                {
                    if (submission < min)
                    {
                        min = submission;
                    } 
                }
            }
            int dialogButton = JOptionPane.showConfirmDialog(null, "Do you want to enter another?", "Perchance", JOptionPane.YES_NO_OPTION);

            if (dialogButton == JOptionPane.YES_OPTION)
            {
                cont = true;
            } else if (dialogButton == JOptionPane.NO_OPTION)
            {
                cont = false;
            }
        }
        JOptionPane.showMessageDialog(null, "The Largest number you inputted was: " + max + "\nThe Smallest number you inputted was: " + min);
    }
}
