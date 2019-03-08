import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class check_downward_diagonal_test {

	@Test
	void test() {
		
		game connect_4 = new game();
		String [][] modified_game_board = {			
														// Rows 
				{" ", " ", " ", " ", " ", " "},			// Row 0
				{"X", " ", " ", "O", " ", " "},			// Row 1
				{" ", "X", " ", " ", "O", " "},			// Row 2
				{" ", " ", "X", " ", "X", "O"},			// Row 3	
				{" ", "X", " ", "X", " ", "X"},			// Row 4
				{"O", " ", " ", " ", " ", " "}			// Row 5
// Columns -->    0    1    2    3    4    5		
		};
		
		connect_4.game_board = modified_game_board;
		boolean response0  = connect_4.check_downward_diagonal();
		assertEquals(true, response0);

		String [][] modified_game_board_1 = {			
														// Rows 
				{" ", " ", " ", "X", " ", " "},			// Row 0
				{" ", "O", " ", " ", " ", "X"},			// Row 1
				{" ", " ", "O", " ", " ", " "},			// Row 2
				{"X", " ", " ", "O", " ", " "},			// Row 3	
				{"O", " ", " ", " ", "X", " "},			// Row 4
				{" ", " ", " ", " ", " ", "O"}			// Row 5
//Columns -->    0    1    2    3    4    5		
				};
	
		connect_4.game_board = modified_game_board_1;
		boolean response1  = connect_4.check_downward_diagonal();
		assertEquals(false, response1);
		
		}}