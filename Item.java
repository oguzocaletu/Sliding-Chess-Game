
public abstract class Item {
	private int koordinateX;
	private int koordinateY;
	private String simge;
	private int puan;
	private boolean alive;
	
	public Item(int koordinateX, int koordinateY,int puan,  String simge) {
		this.koordinateX = koordinateX;
		this.koordinateY = koordinateY;
		this.alive=true;
		this.simge = simge;
		this.puan=puan;
	}
	public boolean getColor() {
		if(this.getSimge().charAt(0)>='a'&&this.getSimge().charAt(0)<='z') {
			return false;//siyah
		}
		return true;//beyaz
	}

	abstract public boolean isAllowed(Board board ,int destX,int destY);
	
	public int getPuan() {
		return puan;
	}

	public String getSimge() {
		return simge;
	}
	public int getKoordinateX() {
		return koordinateX;
	}
	public void setKoordinateX(int koordinateX) {
		this.koordinateX = koordinateX;
	}
	public int getKoordinateY() {
		return koordinateY;
	}
	public void setKoordinateY(int koordinateY) {
		this.koordinateY = koordinateY;
	}
	public boolean isAlive() {
		return alive;
	}
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	


}
