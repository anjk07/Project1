package hometaski;

public class Mathcalc {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		double diametersun = 865000.0;
		double diameterearth = 7600.0;
		double radiussun = diametersun/2;
		double radiusearth = diameterearth/2;
		
		double volumeofearth = (4.0/3.0)* Math.PI * Math.pow(radiusearth,3);
		double volumeofsun = (4.0/3.0)* Math.PI * Math.pow(radiussun,3);
		
		double ratio = volumeofsun/volumeofearth ;
			
		System.out.println("Volume of earth"+ " " +volumeofearth + " "+ "cubic miles");
		System.out.println("Volume of sun"+" " + volumeofsun + " "+ "cubic miles");
		System.out.println("Ratio"+" "+ ratio);
		
	}

}
