public class Person {

    private String name;
    private Gender gender;

    public Person(String name , Gender gender){
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public static void main(String[] args) {
        Person marry = new Person("Marry" , Gender.FEMALE);

        Person herry = new Person("Herry" , Gender.MALE);
        Person marry2 = new Person("Marry" , Gender.FEMALE);
        Person marry3 = new Person("Marry" , Gender.FEMALE);
        Person marry4 = new Person("Marry" , Gender.FEMALE);
    }

}
