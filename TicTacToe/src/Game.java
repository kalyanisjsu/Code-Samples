
public class Game 
{
	char[][] board;
	char currentPlayer;
	
	Game()
	{
		board = new char[3][3];
		currentPlayer = 'x';
	}	
	
	public void initializeBoard()
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				board[i][j] = '-';
			}
		}
	}
	
	public boolean isBoardFull()
	{
		boolean flag = true;
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				if(board[i][j]== '-')
				{
					flag  = false;
				}
			}
		}
		return flag;
	}
	
	public void print()
	{
		for (int i = 0; i < 3; i++) 
		{
			for (int j = 0; j < 3; j++) 
			{
				System.out.print(board[i][j]);
			}
			System.out.println('\n');
		}
	}
	
	public boolean checkforWin()
	{
		if(checkRow() || checkCol() || checkDiag())
		{
			return true;
		}
		return false;
	}
	
	public boolean checkRow()
	{
		for (int i = 0; i < 3; i++) 
		{
			if(checkRowCol(board[i][0],board[i][1], board[i][2]))
				return true;
		}
		return false;
	}
	
	public boolean checkCol()
	{
		for (int i = 0; i < 3; i++) 
		{
			if(checkRowCol(board[0][i],board[1][i], board[2][i]))
				return true;
		}
		return false;
	}
	
	public boolean checkDiag()
	{
		for (int i = 0; i < 3; i++) 
		{
			if(checkRowCol(board[0][0],board[1][1], board[2][2]) == true || checkRowCol(board[2][0],board[1][1], board[0][2]) == true)
				return true;
		}
		return false;
	}
	
	public boolean checkRowCol(char c1, char c2, char c3)
	{
		if(c1 != '-' && (c1 == c2) && (c2 == c3))
			return true;

		return false;
	}
	
	public void changePlayer()
	{
		if(currentPlayer == 'x')
			currentPlayer = 'o';
		else
			currentPlayer = 'x';
	}
	
	public void placeMark(int row, int col)
	{
		if(row >= 0 && row < 3)
		{
			if(col >= 0 && col < 3)
			{
				if(board[row][col] == '-')
					board[row][col]  = currentPlayer;
			}
		}
	}
	
}
