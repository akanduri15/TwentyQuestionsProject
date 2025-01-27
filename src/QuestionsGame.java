// This is a starter file for QuestionsGame.
//
// You should delete this comment and replace it with your class
// header comment.

public class QuestionsGame 
{
    // Your code here

    private static class QuestionNode 
    {
    	public final boolean data;   // data stored at this node
        public QuestionNode left;    // reference to left subtree
        public QuestionNode right;   // reference to right subtree
        
        public QuestionNode(int data) 
        {
            this(data, null, null);
        }
                    
        // Constructs a branch node with the given data and links.
        public QuestionNode(int data, QuestionNode left, QuestionNode right) 
        {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }
}
