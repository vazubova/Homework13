import java.util.Objects;
public class Author {

    private String firstName;
    private String lastName;


    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }


    @Override
    public String toString() {
        return " Автор " + firstName + " " + lastName + ".";
    }

    @Override
    public boolean equals(Object other) {

        if (this == other) {
            return true;
        }
        if (other==null || this.getClass() != other.getClass()) {
            return false;
        }

        return firstName.equals(getFirstName()) && lastName.equals(getLastName());

    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName);
    }

}





