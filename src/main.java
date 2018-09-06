import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		try {
			float base = 0, altura = 0;
			IFactoryFormas factory = new FactoryFormas();
			
			Scanner sc = new Scanner(System.in);  // Reading from System.in
			System.out.println("Qual forma deseja saber a área?\n A-TRIANGULO\n B-QUADRADO\n C-RETANGULO\n");
			EnumFormas batata = EnumFormas.textValueOf(sc.next());	
			
			System.out.println("Informe o valor da base.\n");
			System.out.println(base = sc.nextFloat());
			System.out.println("Informe o valor da altura.\n");
			System.out.println(altura = sc.nextFloat());
			
			Forma quadrado = factory.selecionarForma(EnumFormas.QUADRADO);
			Forma retangulo = factory.selecionarForma(EnumFormas.RETANGULO);
			Forma triangulo = factory.selecionarForma(EnumFormas.TRIANGULO);
			
			if(batata == EnumFormas.TRIANGULO) {
				triangulo.getArea(base, altura);
			}
			
			if(batata == EnumFormas.QUADRADO){
				retangulo.getArea(base, altura);
			}
			
			if(batata == EnumFormas.QUADRADO){
				quadrado.getArea(base, altura);
			}
//			quadrado.getArea(base, altura);
//			retangulo.getArea(base, altura);
//			triangulo.getArea(base, altura);
			

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
