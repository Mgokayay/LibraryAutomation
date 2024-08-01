package src.Model.Entity;

public class Librarian extends Person{
    private String userName;
    private String password; //TODO 1.1 Password validation and setPassword condition
    private String email;
    private double salary;
    private boolean isWorking;

    public Librarian(String name, String surname,String password, long id,String email,double salary) {
        super(name, surname, id);
        this.email = email;
        this.salary = salary;
        this.password = password;
        this.isWorking = Boolean.TRUE;

    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Librarian{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", isWorking=" + isWorking +
                '}';
    }
}
