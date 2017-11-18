public class FunctionData {
    public String question;
    public String function;
    public int score;

    public FunctionData()
    {
        this.question = "";
        this.function = "";
        this.score = 0;
    }

    public FunctionData(String q, String f, int s)
    {
        this.question = q;
        this.function = f;
        this.score = s;
    }
}
