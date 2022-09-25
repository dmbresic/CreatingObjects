import java.util.List;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private Integer age;
    private List<String> favoriteFoods;

    //default constructor
    public Person(){

    }

    public Person(String firstName, String lastName, Integer age, List<String> favoriteFoods) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.favoriteFoods = favoriteFoods;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getFavoriteFoods() {
        return favoriteFoods;
    }

    public void setFavoriteFoods(List<String> favoriteFoods) {
        this.favoriteFoods = favoriteFoods;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) &&
                Objects.equals(lastName, person.lastName) &&
                Objects.equals(age, person.age) &&
                Objects.equals(favoriteFoods, person.favoriteFoods);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, age, favoriteFoods);
    }

    @Override
    public String toString(){
        return "{ Name: " + firstName + " " + lastName + ", " + age + " " + favoriteFoods + " }";
    }
}
