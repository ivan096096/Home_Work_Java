package OOP.HomeWork.lesson_7.Notes.model;

public class NoteMapper {
    public String map(Note note) {
        return String.format("%s,%s,%s,%s", note.getId(), note.getHeader(), note.getContent(), note.getDate());
    }

    public Note map (String line) {
        String[] lines = line.split(",");

        return new Note(lines[0], lines[1], lines[2], lines[3]);
    }

}
