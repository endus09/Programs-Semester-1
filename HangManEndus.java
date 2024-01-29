// endus

import java.util.Arrays;
import java.util.Scanner;

/* Ok this one was a bit of work. I don't really know if making a million methods is
 * what is supposed to be done in a program but that is just the way my brain works and
 * it helped me segment my workloads into something I can understand. */

public class HangManEndus
{

    public static void main(String[] args)
    {

        char[] alphabet;
        char[] wordArray;
        char[] guessLine;
        char[] prevLine;
        char input;
        int fail;
        Scanner scanner;
        String[] words;
        String[] hangmanPhases;
        String randomWord;
        String strAlphabet;
        String alphabetRead;
        String inputStr;

        hangmanPhases = new String[]
        {
            "   _________\n   |      |\n   |\n   |\n   |\n___|___",
            "   _________\n   |      |\n   |      O\n   |\n   |\n___|___",
            "   _________\n   |      |\n   |      O\n   |      |\n   |\n___|___",
            "   _________\n   |      |\n   |      O\n   |     /|\n   |\n___|___",
            "   _________\n   |      |\n   |      O\n   |     /|\\\n   |\n___|___",
            "   _________\n   |      |\n   |      O\n   |     /|\\\n   |      |\n___|___",
            "   _________\n   |      |\n   |      O\n   |     /|\\\n   |      |\n   |     /\n___|___",
            "   _________\n   |      |\n   |      O\n   |     /|\\\n   |      |\n   |     / \\\n___|___"
        };

        strAlphabet = "abcdefghijklmnopqrstuvwxyz";
        words = new String[]
        {
            "java", "computer", "algorithm", "house", "binary"
        };
        alphabet = explode(strAlphabet);
        randomWord = ranWord(words);
        wordArray = explode(randomWord);
        guessLine = new char[wordArray.length];
        fail = 0;
        scanner = new Scanner(System.in);
        for (int c = 0; c < guessLine.length; c++)
        {
            guessLine[c] = '_';
        }
        while (true)
        {
            prevLine = guessLine.clone();
            alphabetRead = concatenate(alphabet);
            System.out.println(hangmanPhases[fail]);
            System.out.println();
            System.out.println(concatenate(alphabet));
            System.out.println();
            System.out.println(guessLine);
            System.out.println("Enter a letter: ");
            inputStr = scanner.nextLine();
            input = inputStr.charAt(0);
            idxLetterSwitch(input, alphabet);
            idxLineSwitch(input, guessLine, wordArray);
            if (Arrays.equals(guessLine, wordArray))
            {
                System.out.println();
                System.out.println("The word is: " + concatenate(guessLine));
                System.out.println();
                System.out.println("YOU WIN!!!");
                System.out.println("""
                                     |\\_/|
                                     `o.o'
                                     =(_)=""");
                break;
            }
            if (Arrays.equals(guessLine, prevLine))
            {
                System.out.println("WRONG");
                fail++;
            }
            if (fail == 7)
            {
                System.out.println(hangmanPhases[fail]);
                System.out.println("YOU LOSE :(");
                break;
            }
        }
    }

    public static String concatenate(char[] array)
    {
        String result = "";
        for (int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        return result;
    }

    public static char[] idxLetterSwitch(char input, char[] alphabet)
    {
        for (int i = 0; i < alphabet.length; i++)
        {
            if (alphabet[i] == input)
            {
                alphabet[i] = '_';
            }
        }
        return alphabet;
    }

    public static char[] idxLineSwitch(char input, char[] line, char[] word)
    {
        for (int i = 0; i < word.length; i++)
        {
            if (word[i] == input)
            {
                line[i] = input;
            }
        }
        return line;
    }

    public static String ranWord(String[] words)
    {
        int ranIDX = (int) (Math.random() * words.length);
        String ranWord = words[ranIDX];
        return ranWord;
    }

    public static char[] explode(String word)
    {
        char[] charArray = word.toCharArray();
        return charArray;
    }
}

