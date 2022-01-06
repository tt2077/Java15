class PrePaid extends Thread
{
	private static int sum=200;
	public void run()
	{
		int fee;
		while(sum>10)
		{
			fee=(int)(100*Math.random());
			talk(fee);
		}
	}
	public synchronized static void talk(int n)
	{
		int tmp=sum-n;
		try
		{
			sleep((int)(1000*Math.random()));
		}
		catch(InterruptedException e){}
		if(tmp>0)
		{
			sum=tmp;
			System.out.println("�q�ܶO"+n+"��,�l�B��"+sum+"��");
		}
	}
}
public class Class14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrePaid phone1=new PrePaid();
		PrePaid phone2=new PrePaid();
		PrePaid phone3=new PrePaid();
		phone1.start();
		phone2.start();
		phone3.start();
	}

}
