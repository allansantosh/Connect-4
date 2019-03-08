import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class check_row_test {

	@Test
	void test() {
		
		game connect_4 = new game();
		String [][] modified_game_board = {			
														// Rows 
				{" ", "O", "O", "O", " ", " "},			// Row 0
				{" ", " ", " ", " ", " ", " "},			// Row 1
				{" ", " ", "O", "O", "O", "O"},			// Row 2
				{" ", " ", " ", " ", " ", " "},			// Row 3	
				{" ", " ", " ", " ", " ", " "},			// Row 4
				{" ", "O", "X", "X", "X", "X"}			// Row 5
		
		};
		
		connect_4.game_board = modified_game_board;
		
		boolean response0  = connect_4.check_row(0,"O");
		boolean response1 = connect_4.check_row(2,"O");
		boolean response2 = connect_4.check_row(4,"O");
		boolean response3 = connect_4.check_row(5,"X");
		
		assertEquals(false, response0);
		assertEquals(true, response1);
		assertEquals(false, response2);
		assertEquals(true, response3);

	}
}


