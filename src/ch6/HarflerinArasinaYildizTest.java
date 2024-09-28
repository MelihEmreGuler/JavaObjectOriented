package ch6;

public class HarflerinArasinaYildizTest {

	public static void main(String[] args) {
		String kelime = "Deneme";
		HarflerinArasinaYildiz harflerinArasinaYildiz = new HarflerinArasinaYildiz();
		String yildizliKelime = harflerinArasinaYildiz.yildizKoy(kelime);
		System.out.println(yildizliKelime);
	}
	
	

}
