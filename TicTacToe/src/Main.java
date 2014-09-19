
public class Main {

	public static void main(String[] args) 
	{
		Game g = new Game();
		g.initializeBoard();
		//g.print();
		g.placeMark(0, 0);
		g.placeMark(1, 1);
		g.placeMark(2, 2);
		
		if(g.checkforWin())
			System.out.println("Winner !!");
		if(g.isBoardFull())
			System.out.println("Draw !!!");
		g.print();
	}

}
