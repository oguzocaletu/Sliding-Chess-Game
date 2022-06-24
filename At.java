
public class At extends Item {

	public At(int koordinateY,int koordinateX,  int puan,  String simge) {
		super(koordinateX, koordinateY, puan,  simge);
		// TODO Auto-generated constructor stub
	}


	
	public boolean isAllowed(Board board ,int destX, int destY) {
		
		if(destX!=this.getKoordinateX()&&destY!=this.getKoordinateY()&&
				(Math.abs(getKoordinateY()-destY)+Math.abs(getKoordinateX()-destX))==3) 
		{
			
			return true;
				
		}
		
		return false;
	}

}
