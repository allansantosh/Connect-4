import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class check_column_test {

	@Test
	void test() {
		
		game connect_4 = new game();
		String [][] modified_game_board = {
				{" ", " ", " ", " ", " ", " "},
				{" ", " ", " ", " ", "O", " "},
				{" ", "X", " ", " ", "O", " "},
				{" ", "X", " ", " ", "O", " "},
				{" ", "X", " ", " ", "O", " "},
				{" ", "X", " ", " ", " ", " "}		
// Columns --->	  0    1    2    3    4    5		
		
		};
		
	
		
		connect_4.game_board = modified_game_board;
		
		boolean response0  = connect_4.check_column(1,"X");
		boolean response1 = connect_4.check_column(0,"X");
		boolean response2 = connect_4.check_column(4,"O");
		
		assertEquals(true, response0);
		assertEquals(false, response1);
		assertEquals(true, response2);

	}
}