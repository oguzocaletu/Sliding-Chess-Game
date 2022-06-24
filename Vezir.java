
public class Vezir extends Item {

	public Vezir(int koordinateY,int koordinateX,  int puan, String simge) {
		super(koordinateX, koordinateY, puan, simge);
	}

	private boolean yolBosMu1(Board board,int destX,int destY) {
		for(int i=Math.min(destX,this.getKoordinateX())+1;i<Math.max(destX, getKoordinateX());i++)
		{
			if(board.getBoard()[destY][i]!=null)
				return false;
		}
		for(int i=Math.min(destY,this.getKoordinateY())+1;i<Math.max(destY, getKoordinateY());i++)
		{
			if(board.getBoard()[i][destX]!=null)
				return false;
		}
		return true;	
	}
	private boolean yolBosMu2(Board board,int destX,int destY) {
		int i=Math.min(destX,this.getKoordinateX())+1;
		int j=Math.min(destY,this.getKoordinateY())+1;
		for(;j<Math.max(destY, getKoordinateY())&i<Math.max(destX, getKoordinateX());i++,j++) {
			if(board.getBoard()[j][i]!=null)
				return false;
		}
		
		return true;	
	}
	public boolean isAllowed(Board board,int destX, int destY) {
		if((destX==this.getKoordinateX()||destY==this.getKoordinateY()))
			return yolBosMu1(board,destX,destY);
		if(Math.abs(destY-this.getKoordinateY())==Math.abs(destX-this.getKoordinateX())) 
			return yolBosMu2(board, destX, destY);
		return false;
	}

}
