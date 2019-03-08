import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class place_item_test {

	@Test
	void test() {

		game connect_4 = new game();
		
		connect_4.print_board();
		connect_4.place_item(1,"X");
		connect_4.place_item(1,"X");
		connect_4.place_item(1,"X");
		connect_4.place_item(1,"X");
		connect_4.print_board();
		
		assertEquals(true,connect_4.check_column(1,"X"));
		
	}
}

// Column 1 is technically column 2 as array starts from index 0