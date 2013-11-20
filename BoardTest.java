import static org.junit.Assert.*;

import org.junit.Test;


public class BoardTest {

    Board board = new Board();
    
	// @Test
	   // public void boardIsEmptyNoWinner() {
	     //   board = new Board();
	       // assertFalse(board.hasWinner());
	    //}

	  /*  @Test
	    public void setMarkNoWinner() {
	        board.setMark("X", 0, 0);
	        assertFalse(board.hasWinner());
	    }*/

	    @Test
	    public void setMarkHasWinner() {
	        board.setMark("X", 0, 0);
	        board.setMark("X", 0, 1);
	        board.setMark("X", 0, 2);
	        assertTrue(board.hasWinner());
	    }

	   
	}


