package May;

public class Mayinkim extends Lopmayin {

	int sokim;
	
	public Mayinkim(String Mamayin, String Tenmayin, String tenhang,
			double Tocdoin, double Giaban,int sokim) 
	{
		super(Mamayin, Tenmayin, tenhang, Tocdoin, Giaban);
		this.sokim=sokim;
		// TODO Auto-generated constructor stub
	}
	@Override public void Inthongtin() {
		super.Inthongtin();
		System.out.println("So kim"+
                sokim);
	};

	@Override
	public void tinhnang() {
		System.out.println(" Lung giay ");
		// TODO Auto-generated method stub

	}

}
