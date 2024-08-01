package src.Model.Entity;

public class Author extends Person {
    private String biography;

    public Author(String name, String surname, long id) {
        super(name, surname, id);
    }


    public Author(String name, String surname, long id,String biography) {
        super(name, surname, id);
        this.biography = biography;
    }
    public String getBiography() {
        if(getBiography() == null) //TODO 1.0 Author biography exception
        {
            setBiography("This Author does not have a biography");
        }
        return biography;
    }
    public void setBiography(String biography) {
        this.biography = biography;
    }
}
