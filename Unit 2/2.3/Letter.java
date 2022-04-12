public class Letter {
    public void writeLetter(){
        greeting();
        specialMessage();
        specialMessage();
        closing();
    }

    public void greeting(){
        System.out.println("HI, friend!");
    }

    public void specialMessage(){
        System.out.println("Conmputer science is awesome!");
    }

    public void closing(){
        System.out.println("See you soon!");
    }

    public static void main(String[] args){
        Letter friendLetter = new Letter();
        friendLetter.writeLetter();
    }
}
