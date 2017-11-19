/**
 * Dunction Data Object
 *
 * A Function Data instance contains all of the data associated with a given function, including the function, the question
 * corresponding to that function, and the score the user gives that specific question.
 *
 * @author Joseph George
 */
public class FunctionData {
    public String question;
    public String function;
    public int score;

    /**
     * Default constructor
     */
    public FunctionData()
    {
        this.question = "";
        this.function = "";
        this.score = 0;
    }

    /**
     * Constructor
     *
     * @param q a question
     * @param f associated function
     * @param s user's score for the current question
     */
    public FunctionData(String q, String f, int s)
    {
        this.question = q;
        this.function = f;
        this.score = s;
    }
}
