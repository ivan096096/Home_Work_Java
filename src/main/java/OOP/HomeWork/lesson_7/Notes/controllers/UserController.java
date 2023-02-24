package OOP.HomeWork.lesson_7.Notes.controllers;

import OOP.HomeWork.lesson_7.Notes.model.Fields;
import OOP.HomeWork.lesson_7.Notes.model.Note;
import OOP.HomeWork.lesson_7.Notes.model.Repository;
import OOP.HomeWork.lesson_7.Notes.utils.NotFoundException;
import OOP.HomeWork.lesson_7.Notes.utils.Validate;

import java.util.List;



public class UserController {
    private final Repository repository;
    private final Validate validate;

    public UserController(Repository repository, Validate validate) {
        this.repository = repository;
        this.validate = validate;
    }

    public void saveNote(Note note) throws Exception {
        validate.checkField(note.getHeader());
        validate.checkField(note.getContent());
        repository.CreateNote(note);
    }

    public void updateNote(Note note, Fields field, String param) throws Exception {
        if (field == Fields.HEADER) {
            validate.checkField(param);
        } else if (field == Fields.CONTENT) {
            validate.checkField(param);
        } 
        repository.UpdateNote(note, field, param);

    }

    public Note readNote(String noteId) throws Exception {
        List<Note> notes = repository.getAllNotes();
        for (Note note : notes) {
            if (note.getId().equals(noteId)) {
                return note;
            }
        }

        throw new NotFoundException("Записка не найдена");
    }

    public List<Note> getNotes() throws Exception {
        return repository.getAllNotes();
    }


    public void delNote(String noteId) throws Exception {

        repository.deleteNote(noteId);

    }
}
