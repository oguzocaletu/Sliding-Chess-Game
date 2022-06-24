
public class Sah extends Item {

	public Sah( int koordinateY,int koordinateX, int puan,  String simge) {
		super(koordinateX, koordinateY, puan, simge);
	}
	
	public boolean isAllowed(Board board,int destX, int destY) {
		if((Math.abs(this.getKoordinateX()-destX)==1&&this.getKoordinateY()==destY)||
			(Math.abs(this.getKoordinateY()-destY)==1&&this.getKoordinateX()==destX)||
			(Math.abs(this.getKoordinateX()-destX)==1&&Math.abs(this.getKoordinateY()-destY)==1))
			return true;
		
		return false;
	}

}
