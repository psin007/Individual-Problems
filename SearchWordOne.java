package interviewpractice;
/*
 *  Given a 2D board and a word, find if the word exists in the grid.
 *  The word can be constructed from letters of sequentially adjacent cell,
 *  where "adjacent" cells are those horizontally or vertically neighboring. 
 *  The same letter cell may not be used more than once.
 */
public class SearchWordOne {
	 public boolean exist(char[][] board, String word) {
	        char firstLetter = word.charAt(0);
	        for(int i = 0; i < board.length ; i++){
	            for(int j= 0; j< board[0].length; j++){        
	                if(board[i][j] == firstLetter && dfs(i,j,board,word.toCharArray(),0))
	                    return true;
	            }    
	        }
	        return false;
	    }
	    
	    public boolean dfs(int i, int j, char[][] board,char[] word,int index){
	        
	        if(index == word.length)
	            return true;
	            
	        
	        if(i < 0 || j < 0 || i > board.length-1 || j > board[0].length -1 || board[i][j] != word[index])
	            return false;
	        
	        char c = board[i][j];
	        board[i][j] = '$';
	        
	        boolean returnVal = (
	            dfs(i+1,j,board,word,index+1) ||
	            dfs(i-1,j,board,word,index+1) ||
	            dfs(i,j+1,board,word,index+1) ||
	            dfs(i,j-1,board,word,index+1)
	        );
	        board[i][j] = c;
	        return returnVal;
	        
	    }
}
