import java.util.Scanner;

public class game {
	
	String [][] game_board = {
			
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "},
			{" ", " ", " ", " ", " ", " "}		
	};
	
	boolean game_done = false;
	
	public game() {}
	
	public void print_board() {
		
		System.out.println("");
		System.out.println("-------------------------");
		System.out.println("|       Connect 4       |");
		System.out.println("-------------------------");

		for (int i = 0; i < game_board.length; i++) {
			for (int j = 0; j < game_board.length; j++) {
				if (game_board[i][j] == null) {
					System.out.print("| " + "  ");
				}
				else {
					System.out.print("| " + game_board[i][j] + " ");
				}
			}
			System.out.print("|");
			System.out.println();
		}
		System.out.println("-------------------------");
		System.out.println("| 1   2   3   4   5   6 |");
		System.out.println("-------------------------");
	}
	
	public void place_item(int column, String letter) {
		
		for (int i = game_board.length-1; i >= 0; i--){
			if (game_board[i][column] == " "){
				game_board[i][column] = letter;
			check_winner(i,column,letter);
			break;
				}
			}
		}
	
	public void check_winner(int row, int column, String letter) {
		if (check_column(column,letter) || check_row (row, letter) ||
			check_downward_diagonal() || check_upward_diagonal()) {
			game_done = true;
		}	
	}
	
	public boolean check_column(int column, String letter) {
		
		int count = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			if (game_board[i][column].equals(letter)) {
				count++;
				if (count == 4) {
					break;
				}
			}
			else {
				count = 0;
			}
		}
		
		if (count == 4) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean check_row(int row, String letter) {
		
		int count = 0;
		
		for (int i = 0 ; i < 6 ; i++) {
			if (game_board[row][i].equals(letter)) {
				count++;
				if (count == 4) {
					break;
				}
			}
			else {
				count = 0;
			}
		}

		if (count == 4) {
			return true;
		}
		else {
			return false;
		}	
	}
	
	public boolean check_downward_diagonal (){

		boolean check = false;
		
		for (int row = 0; row < game_board.length - 3; row++){
			for (int column = 0; column < game_board[row].length - 3; column++){
				if (game_board[row][column] != " " && 
					game_board[row][column] == game_board[row+1][column+1] && 
					game_board[row][column] == game_board[row+2][column+2] && 
					game_board[row][column] == game_board[row+3][column+3])
					{
						check=true;
					}
				}
			}
		return check;
	}
	
	public boolean check_upward_diagonal() {
		
		boolean check = false;
		
		for (int row = 0; row < game_board.length - 3; row++){
			for (int column = 3; column < game_board[row].length; column++){
				if (game_board[row][column] != " " && 
					game_board[row][column] == game_board[row+1][column-1] &&
					game_board[row][column] == game_board[row+2][column-2] &&
					game_board[row][column] == game_board[row+3][column-3])
						{
						check = true;
						}
					}
				}
			return check;
		}
	
	public static void main(String[] args) {
		
		game connect_4 = new game();
		
		connect_4.print_board();
		
		Scanner input1,input2,player1,player2;
		
		System.out.println("\nWelcome to Connect 4. Hope you enjoy the game.\n");
		
		player1 = new Scanner (System.in);
		player2 = new Scanner (System.in);
		
		System.out.print("Enter player 1 name :  ");
		String player_1 = player1.next();
		System.out.print("Enter player 2 name :  ");
		String player_2 = player2.next();
		
		while(true) {
			
			System.out.println();
			System.out.print(player_1 + ", your symbol is 'O'. Enter column you want to mark : ");
			input1 = new Scanner (System.in);
			int column = input1.nextInt();
			while(column > 6 || column < 1 ) {
				System.out.print("Please enter valid column: ");
				column = input1.nextInt();
			}
			
			connect_4.place_item(column-1,"O");
			connect_4.print_board();
			
			if (connect_4.game_done == true) {
				System.out.println();
				System.out.println(player_1 + " has won the game !!!! ");
				break;
			}
			
			System.out.println();
			System.out.print(player_2 + ", your symbol is 'X'. Enter column you want to mark : ");
			input2 = new Scanner (System.in);
			int column2 = input2.nextInt();
			while(column2 > 6 || column2 < 1 ) {
				System.out.print("Please enter valid column: ");
				column2 = input2.nextInt();
			}
			
			connect_4.place_item(column2-1,"X");
			connect_4.print_board();
			
			if (connect_4.game_done == true) {
				if (connect_4.game_done == true) {
				System.out.println();
				System.out.println(player_2 + " has won the game !!!! ");
				break;
				}
			}
		}
	}
}