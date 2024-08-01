package src.Model.Entity;

public abstract class Person {
    private String name;
    private long id;
    private String surname;

    public Person(String name,String surname,long id){
        this.name = name;
        this.surname = surname;
        this.id = id;

    }

    public String getName(){
        return name;
    }

    public long getId(){
        return id;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setId(long id){
        this.id = id;
    }
}
