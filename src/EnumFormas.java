
public enum EnumFormas {

	TRIANGULO("A"),
	QUADRADO("B"),
	RETANGULO("C");

    private  String textValue;

    EnumFormas(String textValue) {
        this.textValue = textValue;
    }

    public static EnumFormas textValueOf(String textValue){

        for(EnumFormas value : values()) {
            if(value.textValue.equals(textValue)) {
                return value;
            }
        }

        throw new IllegalArgumentException("No EnumWithValueOf  for value: " + textValue);  
    }   
}
