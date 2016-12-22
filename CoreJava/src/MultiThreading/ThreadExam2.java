package MultiThreading;

public class ThreadExam2 extends Thread {
	public void run(){
		for(int i=0;i<8;i++){
			System.out.println("Message");
		}
	}

}
