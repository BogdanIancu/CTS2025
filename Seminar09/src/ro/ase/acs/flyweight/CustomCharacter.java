package ro.ase.acs.flyweight;

public class CustomCharacter implements TextCharacter {
    private byte[] image;
    private char character;

    public CustomCharacter(byte[] image, char character) {
        this.image = image;
        this.character = character;
    }

    @Override
    public void display(CharacterPosition characterPosition) {
        System.out.println(character + " " + characterPosition.getLine() +
                ":" + characterPosition.getColumn());
    }
}
