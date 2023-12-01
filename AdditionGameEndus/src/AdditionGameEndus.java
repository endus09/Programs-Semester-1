// by endus

/* This program prompts you to enter how many addition problems you would like to attempt and then
generates however many addition problems were requested. The numbers being added are integers in the range between 10 and 50 inclusive. */ 

import javax.swing.JOptionPane;

public class AdditionGameEndus
{

    public static void main(String[] args)
    {
        String questionsString = JOptionPane.showInputDialog("How many addition problems would you like to attempt?");
        int questions = Integer.parseInt(questionsString);
        int score = 0;
        for (int i = 0; i < questions; i++)
        {
            int ran1 = (int) (Math.random() * 41) + 10;
            int ran2 = (int) (Math.random() * 41) + 10;
            int ans = ran1 + ran2;
            String submissionString = JOptionPane.showInputDialog("What is " + ran1 + " + " + ran2 + "?");
            int submission = Integer.parseInt(submissionString);
            if (ans == submission)
            {
                JOptionPane.showMessageDialog(null, "Correct!", null, JOptionPane.INFORMATION_MESSAGE);
                score++;
            } else
            {
                JOptionPane.showMessageDialog(null, "Incorrect!\n The answer is: " + ans, null, JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "You got " + score + " out of " + questions + " correct!");
    }
    
}
