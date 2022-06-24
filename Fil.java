
public class Fil extends Item {

	public Fil( int koordinateY,int koordinateX, int puan,  String simge) {
		super(koordinateX, koordinateY, puan,  simge);
	}

	private boolean yolBosMu(Board board,int destX,int destY) {
		int i=Math.min(destX,this.getKoordinateX())+1;
		int j=Math.min(destY,this.getKoordinateY())+1;
		for(;j<Math.max(destY, getKoordinateY())&i<Math.max(destX, getKoordinateX());i++,j++) {
			if(board.getBoard()[j][i]!=null)
				return false;
		}
		
		return true;
	}
	
	public boolean isAllowed(Board board, int destX, int destY) {
		if(Math.abs(destY-this.getKoordinateY())==Math.abs(destX-this.getKoordinateX())) {
			return yolBosMu(board,destX,destY);
		}
		return false;
	}
	
}
