package May;

public class Mayinmuc extends Lopmayin {

	int sobinhmuc;
	public Mayinmuc(String Mamayin, String Tenmayin, String tenhang,
			double Tocdoin, double Giaban, int sobinhmuc) {
		super(Mamayin, Tenmayin, tenhang, Tocdoin, Giaban);
		// TODO Auto-generated constructor stub
	}

	@Override public void Inthongtin() {
		super.Inthongtin();
		System.out.println("So binh muc"+
                sobinhmuc);
	};
	@Override
	public void tinhnang() {
		System.out.println(" In sieu chuan ");
		// TODO Auto-generated method stub

	}

}
