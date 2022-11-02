package src.ElGato;

public enum Color {
    BLACK("Black"),
    WHITE("White"),
    RED("Red"),
    BROWN("Brown"),
    SPOTTED("Spotted");
    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
