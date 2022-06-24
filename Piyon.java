
public class Piyon extends Item {


	public Piyon(int koordinateY,int koordinateX, int puan,  String simge) {
		super(koordinateX, koordinateY, puan , simge);
	}
	
	private boolean yolBosMu(Board board,int destX,int destY) {
		if(board.getBoard()[destY][destX]==null)
			return true;
		return false;
		
	}
	public boolean isAllowed(Board board,int destX,int destY) {
		if(destX==this.getKoordinateX()) {
			if(yolBosMu(board,destX,destY)) {
				if(getColor()) {//beyaz
					if(destX==this.getKoordinateX()&&destY-1==this.getKoordinateY())
						return true;
					return false;
				}
				else {//siyah
					if(destX==this.getKoordinateX()&&destY+1==this.getKoordinateY())
						return true;
					return false;
				}
			}
			return false;
		}
		else {
			if(getColor()) {//beyaz
				if((destX==this.getKoordinateX()-1||destX==this.getKoordinateX()+1)&&destY-1==this.getKoordinateY())
					return true;
				return false;
			}
			else {//siyah
				if((destX==this.getKoordinateX()-1||destX==this.getKoordinateX()+1)&&destY+1==this.getKoordinateY())
					return true;
				return false;
			}
		}
	}

}
