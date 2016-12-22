package MultiThreading;

public class ThreadExam1 extends Thread {
	public void run(){
		for(int i=0;i<8;i++){
		System.out.println("display something" + Thread.currentThread().getId());
	}

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadExam1 t1 =new ThreadExam1();
		ThreadExam2 t2=new ThreadExam2();
		t1.start();
		//t1.sleep(1000);
		t2.start();

	}

}
