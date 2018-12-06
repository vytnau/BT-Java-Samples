package lt.bt.java.demo.nestedclass.demo4;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while(true){
					System.out.println(i + " Labas");
					i++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}				
			}
		});
		
		th.start();
	}

}
