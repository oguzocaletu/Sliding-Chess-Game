
public class Player{
	private String Color;
	private String name;
	private int puan;
	public Player(String name,String color) {
		this.Color=color;
		this.name=name;
		this.puan=0;
	}
	public boolean hamleYap(Board board,Item item,int kordY,int kordX) throws Throwable {
		if(item.isAllowed(board, kordX,kordY)) {
			if(board.getBoard()[kordY][kordX] instanceof Sah&&board.getBoard()[kordY][kordX].getColor()!=item.getColor())
				return true;
			if(board.getBoard()[kordY][kordX]!=null&&board.getBoard()[kordY][kordX].getColor()!=item.getColor()) 
				increasePuan(board.getBoard()[kordY][kordX].getPuan());
			if(board.getBoard()[kordY][kordX]!=null&&board.getBoard()[kordY][kordX].getColor()==item.getColor())
				throw new Exception("Kendi tasini yiyemezsin");
			board.setBoard(item.getKoordinateY(),item.getKoordinateX(),null);
			item.setKoordinateX(kordX);
			item.setKoordinateY(kordY);
			
			
			
			board.setBoard(kordY,kordX,item);
			
		}
		else
			throw new Exception("Kural disi! Hamle Gecersiz");
		return false;
	}
	public String getColor() {
		return Color;
	}
	public int getPuan() {
		return puan;
	}
	public void increasePuan(int puan) {
		this.puan += puan;
	}
	public String getName() {
		return name;
	}
	

}
