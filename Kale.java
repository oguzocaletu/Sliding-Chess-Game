
public class Kale extends Item {

	public Kale(int koordinateY,int koordinateX,  int puan,  String simge) {
		super(koordinateX, koordinateY, puan,  simge);
		// TODO Auto-generated constructor stub
	}

	private boolean yolBosMu(Board board,int destX,int destY) {
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
	public boolean isAllowed(Board board,int destX, int destY) {
		if(destX==this.getKoordinateX()||destY==this.getKoordinateY()) {
			return yolBosMu(board,destX,destY);
		}
		return false;
	}

}
