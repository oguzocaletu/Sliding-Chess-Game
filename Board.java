
public class Board {
	private Item[][] board= new Item[8][8];
	
	public  Item[][] getBoard() {
		return board;
	}

	public  void setBoard(int Y,int X, Item item) {
		board[Y][X] = item;
	}
	public Item[][] kaydir() {
		Item [] temp=new Item[8];
		for(int i=0;i<this.board.length;i++) {
			temp[i]=board[i][0];
		}
		for(int i=0;i<this.board.length;i++) {
			for(int j=0;j<this.board.length-1;j++) {
				if(board[i][j+1]!=null)
					board[i][j+1].setKoordinateX(j);
				board[i][j]=board[i][j+1];
			}
		}
		for(int i=0;i<this.board.length;i++) {
			if(temp[i]!=null)
				temp[i].setKoordinateX(7);
			board[i][7]=temp[i];
		}
		return this.board;
	}
	public Item[][] initalBoard() {
		
		for(int i=0;i<8;i++) {
			board[0][i]=new Piyon(0,i,1,"P");
			board[7][i]=new Piyon(7,i,1,"p");
		}
		board[1][0]=new Kale(1,0,5,"K");
		board[1][1]=new At(1,1,3,"A");
		board[1][2]=new Fil(1,2,3,"F");
		board[1][3]=new Vezir(1,3,9,"V");
		board[1][4]=new Sah(1,4,1000,"S");
		board[1][5]=new Fil(1,5,3,"F");
		board[1][6]=new At(1,6,3,"A");
		board[1][7]=new Kale(1,7,5,"K");
		
		board[6][0]=new Kale(6,0,5,"k");
		board[6][1]=new At(6,1,3,"a");
		board[6][2]=new Fil(6,2,3,"f");
		board[6][3]=new Vezir(6,3,9,"v");
		board[6][4]=new Sah(6,4,1000,"s");
		board[6][5]=new Fil(6,5,3,"f");
		board[6][6]=new At(6,6,3,"a");
		board[6][7]=new Kale(6,7,5,"k");
		return board;
	}
	
	public void ekranaBas() {
		for(int i=1;i<9;i++)
			System.out.print(" \t"+i);
		System.out.println("\n");
		
		for(int i=0;i<board.length;i++) {
			System.out.print(((char)('a'+i))+"\t");
			for(int j=0;j<board[0].length;j++) {
				if(board[i][j]!=null)
					System.out.print(board[i][j].getSimge()+"\t");
				else
					System.out.print("-\t");
			}
			System.out.println();
		}
	}
	
	
}
