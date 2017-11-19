import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main class creates appropriate object for user to take the quiz and then calculates the results.
 *
 * @author Joseph George
 */
public class main
{
    public static void main(String[] args)
    {
        // Create and initialize a new question bank
        QuestionBank newQuiz = new QuestionBank();
        newQuiz.setQuestions();
        ArrayList<FunctionData> quizQuestions = newQuiz.getQuestions();

        System.out.println("!-Welcome to Jungian Cognitive Function Test 2017-! \n" +
                           "DIRECTIONS: For each question, input a number 1 - 5, where: ");
        System.out.println("1: This is not me at all / I cannot relate!");
        System.out.println("2: This is a little like me / I can relate a little bit!");
        System.out.println("3: This is somewhat me / I can relate somewhat!");
        System.out.println("4: This is like me a lot / I can relate a lot!");
        System.out.println("5: This is basically me IRL / I can relate A LOT!\n");

        // For each question from the bank, ask user and get their input
        //TODO: Check that user input is always an integer between 1 and 5
        Scanner reader = new Scanner(System.in);
        for(int i = 0; i < quizQuestions.size(); i++)
        {
            System.out.println(quizQuestions.get(i).question);
            int userScore = reader.nextInt();
            quizQuestions.get(i).score = userScore;
        }
        System.out.println("\n");

        // Sum up function answers and print them out to user
        newQuiz.setFunctionCount();
        newQuiz.printFunctionCount();

        // Pass the functions with associated counts to TypeWriter instance
        // which will calculate the type and print info related to it
        TypeWriter thisType = new TypeWriter(newQuiz.getFunctionCount());
        thisType.findDomAndAux();
        thisType.printType();
    }
}
