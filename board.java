public abstract class boardclass {
	protected int n;
	protected char grid[][];
	public boardclass() {
		n=0;
		grid=null;
	}
	public boardclass(int size) {
		n=size;
		grid = new char[n][n];
	}
	public abstract boolean update_board(int x,int y,char symbol);
	public abstract boolean is_winner(char symbol);
	public abstract boolean is_draw();
	public void display_board() {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++)
			{
				System.out.print("|_"+grid[i][j]+"_|");
			}
				System.out.println();
			}
		}
	
	

}
