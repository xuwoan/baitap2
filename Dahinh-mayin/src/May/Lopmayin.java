package May;

public abstract class Lopmayin {
	String Mamayin;
	String Tenmayin;
	String tenhang;
	double Tocdoin;
	double Giaban;
	public Lopmayin(String Mamayin , String Tenmayin ,String tenhang ,double Tocdoin, double Giaban)
	{
		this.Mamayin=Mamayin;
		this.Tenmayin=Tenmayin;
		this.tenhang=tenhang;
		this.Tocdoin=Tocdoin;
		this.Giaban= Giaban;
		
	}
	public void Inthongtin()
	{

        System.out.println("Ma may in 1  "+
            Mamayin);
        System.out.println("Ten may in "+
            Tenmayin);
        System.out.println("ten Hang "+
            tenhang);
        System.out.println("Toc do in"+ Tocdoin
            );
        System.out.println("ten Gia ban "+
                Giaban);
	}
	public abstract void tinhnang();
	
	

}
