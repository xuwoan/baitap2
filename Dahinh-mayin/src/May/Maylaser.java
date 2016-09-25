package May;

public class Maylaser extends Lopmayin {
	String loaihopmuc;
	double sotrangmax;
	public Maylaser(String Mamayin, String Tenmayin, String tenhang,
			double Tocdoin, double Giaban ,String loaihopmuc,
	double sotrangmax) {
		super(Mamayin, Tenmayin, tenhang, Tocdoin, Giaban);
		this.loaihopmuc=loaihopmuc;
		this.sotrangmax=sotrangmax;
		// TODO Auto-generated constructor stub
	}
	@Override public void Inthongtin() {
		super.Inthongtin();
		System.out.println("So loai hop muc"+
                loaihopmuc);
		System.out.println("So so trang max"+
                sotrangmax);
	};
	@Override
	public void tinhnang() {
		System.out.println("In cuc nhanh");
		// TODO Auto-generated method stub
		
	}

}
