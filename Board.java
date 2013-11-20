
public class Board {
	private String[][]board= new String[3][3];
	//private boolean hasWinner;
	
	
	public Board(){
		//hasWinner=false;
		eraser();
	}
	
	public void eraser(){
		for (int z=0;z<3;z++){
			for (int s=0;s<3;s++){
				board[z][s]="0";
			}
		}
	}
		
	
	public void setMark(String mark, int x, int y)
	//throws InvalidPositionException 
	{
		if(mark.equals("O")||mark.equals("X")){
		board[x][y]=mark;
		}//else throws new InvalidPositionException("falsche Zeichen!!!!");
	}
	public boolean hasWinner(){
		
		
		for(int i=0;i<3;i++){
			if (board[0][i].equals(board[1][i]) && board[1][i].equals(board[2][i]))
				return true ;
		}
		
		for(int i=0;i<3;i++){
			if (board[i][0].equals(board[i][1]) && board[i][0].equals(board[i][2]))
				return true ;
		}
		
		if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) )
            return true;

        if (board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]) )
            return true;
		
        
        return false;
        
	
	}
	
		
		
	
	}
	

