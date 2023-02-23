public class xoboardclass extends boardclass  {

	xoboardclass(int size)
	{
		super(size);
	}
	xoboardclass()
	{
		super(3);
	}
	@Override
	public boolean update_board(int x, int y, char symbol) {
		if(((x<n&&x>0)&&(y<n&&y>0))&&(symbol=='x'||symbol=='y'))
		{
			if(grid[x][y]!='x'&&grid[x][y]!='y')
			{
				grid[x][y]=symbol;
			return true;
			}
			else
			{return false;}
		}
		return false;
	}

	@Override
	public boolean is_winner(char symbol) {
		int rightdiag=0;
		int leftdiag=0;
		for(int i=0,j=n-1;i<n && j>=0;i++,j--)
		{
			if(grid[i][i]=='x') {
				leftdiag++;
			}
			if(grid[i][j]=='x')
			{
				rightdiag++;
			}
		}
		if(rightdiag==n||leftdiag==n)
		{
			return true;
		}
		for(int i=0;i<n;i++)
		{
			int hits=0;
			for(int j=0;j<n;j++)
			{
				if(grid[i][j]=='x')
				{
					hits++;
				}
			}
			if(hits==n)
			{
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean is_draw() {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(grid[i][j]!='x'&&grid[i][j]!='y')
				{
					return false;
				}
			}
		}
		if(is_winner('x')||is_winner('y'))
		{
			return false;
		}
		
		return true;
	}

}
