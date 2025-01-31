// This is a starter file for QuestionsGame.
//
// QuestionsGame.java
// header comment.
import java.util.Scanner;
import java.io.PrintStream;

public class QuestionsGame 
{
    // Your code here
	public QuestionNode overallRoot;
	public Scanner inputCopy;
	public int size;
	Scanner console = new Scanner(System.in);
    
    public QuestionsGame(String object)
    {
    	//QuestionsGame game = new QuestionsGame(object);
    	overallRoot = new QuestionNode(object);
    }
    public QuestionsGame(Scanner input)//creating the tree here!
    {
    	//mainInput = input;
    	inputCopy = input;
    	inputCopy.nextLine();//sets it to first line from input file "Q:"
    	overallRoot = new QuestionNode(inputCopy.nextLine());//second line in file
    	
    	recur(overallRoot, inputCopy);
    }
   /* public void add(String question)
    {
    	if(overallRoot==null)//checks if list is empty
		{
			overallRoot = new QuestionNode(question);//sets overall root to new node with value
			size++;//increases list size
			//return true;//successfully added message
		}
		else
		{
			QuestionNode temp = overallRoot; //sets temp to overall root
			addHelper(question);
		}
    }
    public String addHelper(String current, String prev, Scanner input)
    {
    	if(current.equals("A:"))
    	{
    		//addHelper(prev, prev, input);
    		return input.nextLine();
    	}
    	addHelper(input.nextLine(), current, input);
    	return current;
    	
    }
    */
    public void recur(QuestionNode tempPrev, Scanner input)
    {
    	String type = input.nextLine();
    	String line = input.nextLine();
    	QuestionNode n = new QuestionNode(line);
    	if(tempPrev.left==null)
    	{
    		tempPrev.left = n;
    	}
    	else
    	{
    		tempPrev.right = n;
    	}
    	if(!(type.equals("A:")))
    	{
    		if(tempPrev.left.data.contains("?"))
    			tempPrev = tempPrev.left;
    		else
    			tempPrev = tempPrev.right;
    	}
    	if(tempPrev.left!=null && tempPrev.right!=null && input.hasNextLine())
    		recur(overallRoot,input);
    	else if((tempPrev.left==null || tempPrev.right==null) && input.hasNextLine())
    		recur(tempPrev,input);
    		
    }
    public void saveQuestions(PrintStream output)
    {
    	if(output==null)
    	{
    		throw new IllegalArgumentException();
    	}
    	else
    	{
    		saveHelper(overallRoot, output);
    	}
    }
    
    public void saveHelper(QuestionsGame.QuestionNode node, PrintStream output)
    {
    	output.println(node.data);
    	if(node.left!=null)
    	{
    		saveHelper(node.left, output);//go down left side
			saveHelper(node.left, output);//go to right nodes
    	}
    	//return overallRoot;
    }
    public void play()//going through the tree, yes=left and no=right until we hit a leaf
    {
    	while(overallRoot.left != null && overallRoot.right != null)
    	{
    		if(console.nextLine().equals("y"))
    		{
    			overallRoot = overallRoot.left;
    		}
    		else
    		{
    			overallRoot = overallRoot.right;
    		}
    	}
    }
    
    static class QuestionNode 
    {
    	public final String data;   // data stored at this node
        public QuestionNode left;    // reference to left subtree (go left if yes)
        public QuestionNode right;   // reference to right subtree (go right if no)
        
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
}
