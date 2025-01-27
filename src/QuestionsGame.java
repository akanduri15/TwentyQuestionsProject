// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.
import java.util.Scanner;
import java.io.PrintStream;

public class QuestionsGame 
{
    // Your code here

    private static class QuestionNode 
    {
    	public final String data;   // data stored at this node
        public QuestionNode left;    // reference to left subtree
        public QuestionNode right;   // reference to right subtree
        
        public QuestionNode(String data) 
        {
            this(data, null, null);
        }
                    
        // Constructs a branch node with the given data and links.
        public QuestionNode(String data, QuestionNode left, QuestionNode right) 
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
    
    public QuestionsGame(String object)
    {
    	QuestionsGame questionsGame = new QuestionsGame(object);
    }
    public QuestionsGame(Scanner input)
    {
    	QuestionsGame questionsGame = new QuestionsGame(input);
    			
    }
    public void saveQuestions(PrintStream output)
    {
    	
    }
    public void play()
    {
    	
    }
}
