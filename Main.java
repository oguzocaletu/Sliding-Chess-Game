import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Throwable {
		Scanner key=new Scanner(System.in);
		System.out.println("Beyaz takim isminizi giriniz:");
		String name1=key.nextLine();
		Player oyuncu1=new Player(name1,"Beyaz");
		System.out.println("Siyah takim isminizi giriniz:");
		String name2=key.nextLine();
		Player oyuncu2=new Player(name2,"Siyah"); 
		boolean sira=true;//beyaz oyuncu
		Board b=new Board();
		b.initalBoard();
		b.ekranaBas();
		while(true) {
			
			try {
				System.out.println();
				System.out.print("\t\t"+oyuncu1.getName()+" Puani: "+oyuncu1.getPuan()+"\t");
				System.out.println(oyuncu2.getName()+" Puani: "+oyuncu2.getPuan());
				
				System.out.println();
				
				if(sira) {//beyaz
					System.out.print(oyuncu1.getName()+"! Oynamak istediginiz tasin koordinatini ve tasi koymak istediginiz koordinati giriniz:"
							+ "\n");
					String[] input=key.nextLine().split(" ");
					if(input[0].equals("exit")) {
						System.out.println("Oyun sonlanıyor......");
						System.out.print("\t\t"+oyuncu1.getName()+" Puani: "+oyuncu1.getPuan()+"\t");
						System.out.println(oyuncu2.getName()+" Puani: "+oyuncu2.getPuan());
						break;
					}
					int ilkY=input[0].charAt(0)-'a';
					int ilkX=input[0].charAt(1)-'1';
					int sonY=input[1].charAt(0)-'a';
					int sonX=input[1].charAt(1)-'1';
					Item item=b.getBoard()[ilkY][ilkX];
					if(item!=null&&!item.getColor()) {
						System.out.println("Lutfen kendi renginizi oynayin");
						continue;
					}
					try {
						if(oyuncu1.hamleYap(b, item, sonY, sonX)) {
							System.out.println("!! "+oyuncu1.getName().toUpperCase()+" !! OYUNU KAZANDI");
							System.out.println("Puan: "+oyuncu1.getPuan());
							break;
						}
					} catch (Throwable e) {
						
						System.out.println(e.getMessage());
						continue;
					}
					b.kaydir();
					sira=false;
				}
				else {
					System.out.print(oyuncu2.getName()+"! Oynamak istediginiz tasin koordinatini ve tasi koymak istediginiz koordinati giriniz:\n");
					String[] input=key.nextLine().split(" ");
					if(input[0].equals("exit")) {
						System.out.println("Oyun sonlanıyor......");
						System.out.print("\t\t"+oyuncu1.getName()+" Puani: "+oyuncu1.getPuan()+"\t");
						System.out.println(oyuncu2.getName()+" Puani: "+oyuncu2.getPuan());
						break;
					}
					int ilkY=input[0].charAt(0)-'a';
					int ilkX=input[0].charAt(1)-'1';
					int sonY=input[1].charAt(0)-'a';
					int sonX=input[1].charAt(1)-'1';
					Item item=b.getBoard()[ilkY][ilkX];
					if(item!=null&&item.getColor()) {
						System.out.println("Lutfen kendi renginizi oynayin");
						continue;
					}
					try {
						if(oyuncu2.hamleYap(b, item, sonY, sonX)) {
							System.out.println("!! "+oyuncu2.getName().toUpperCase()+" !! OYUNU KAZANDI");
							System.out.println("Puan: "+oyuncu2.getPuan());
							break;
						}
					} catch (Throwable e) {
						
						System.out.println(e.getMessage());
						continue;
					}
					b.kaydir();
					sira=true;							
				}

				b.ekranaBas();
			}
			catch(Exception e) {
				
				System.out.println("hatali hareket");
			}
		}
		key.close();

	}

}
