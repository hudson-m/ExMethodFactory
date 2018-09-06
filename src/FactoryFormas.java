
public class FactoryFormas implements IFactoryFormas {
	@Override
	public Forma selecionarForma(EnumFormas tipo) throws Exception {
		switch (tipo) {
		case QUADRADO:
			return new Quadrado();

		case RETANGULO:
			return new Retangulo();

		case TRIANGULO:
			return new Triangulo();

		default:
			throw new Exception("Forma Inválida.");
		}

	}
}