public class LetterRunner {
    public static void main(String[] args) {
        // create Letter object
        Letter myLetter = new Letter("Mr. Miller");

        // write letters to various people
        myLetter.writeLetter("Abdul");
        System.out.println();

        myLetter.writeLetter("Pritika");
        System.out.println();

        myLetter.writeLetter("Ethan");
        System.out.println();

        myLetter.writeLetter("Lucy");

    }
}
