package classstructuremethods;

public class NoteMain {
    public static void main(String[] args) {
        Note newNote = new Note();
        newNote.setName("Tanuló");
        newNote.setTopic("Téma");
        newNote.setText("Szöveg szöveggel");

        System.out.println(newNote.getNoteText());
    }
}
