package assignment1;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment obj = new Assignment();
		obj.SimpleIntrest(13000, 12, 2);
		obj.CompoundIntrest(13000, 12, 5, 2);
		
		
	}
	
	public void SimpleIntrest (float P, float R, int T)
	{
		// p=principle amount, r= rate, t= time
		float SI= (P*R*T)/100;
		System.out.println("simple Intrest =" +SI);
	}
	
public void CompoundIntrest(float p, float r, float n, float t)
{
	// p= principle, r=rate, t= time, n= number
	
	double CompoundIntrest = p*(Math.pow((1+r/100), (t*n)))-p;
	
	System.out.println("Compound Intrest= " +CompoundIntrest);
}


}
