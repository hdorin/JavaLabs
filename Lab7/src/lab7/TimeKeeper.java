package lab7;

public class TimeKeeper extends Thread{
	long startTime,stopTime ;
	Player player;
	public TimeKeeper(Player player) {
		this.player=player;
	}
	public void run() {
		 startTime=System.currentTimeMillis();
		while(player.isGameOver()==false) {
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		stopTime=System.currentTimeMillis();
		System.out.println("Elapsed time:"+(float)((stopTime - startTime)/1000) + "seconds");
	}
	
}
