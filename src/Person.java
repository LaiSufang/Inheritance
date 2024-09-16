public class Person {
    private String ID;
    private String firstName;
    private String lastName;
    private String title;
    private int YOB;

    /**
     * @param ID person's id
     * @param firstName person's first name
     * @param lastName person's last name
     * @param title person's title
     * @param YOB person's year of birth
     */
    public Person(String ID, String firstName, String lastName, String title, int YOB) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.YOB = YOB;
    }

    /**
     * @return return person's id
     */
    public String getID() {
        return ID;
    }

    /**
     * @param ID the person's id to be set
     */
    public void setID(String ID) {
        this.ID = ID;
    }

    /**
     * @return return person's first name
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the person's first name to be set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return return person's last name
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the person's last name to be set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return return person's title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title person's title to be set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return return person's year of birth
     */
    public int getYOB() {
        return YOB;
    }

    /**
     * @param YOB person's year of birth to be set
     */
    public void setYOB(int YOB) {
        this.YOB = YOB;
    }

    /**
     * @return person's full name
     */
    public String fullName() {
        return firstName + " " + lastName;
    }

    /**
     * @return return person's formal name
     */
    public String formalName() {
        return title + " " + fullName();
    }

    /**
     * @return return the age based on current year
     */
    public String getAge() {
        return Integer.toString(2024 - getYOB());
    }

    /**
     * @return return the calculated age for a specified year
     */
    public String getAge(int year) {
        return Integer.toString(year - getYOB());
    }

    /**
     * @return return a string representation of the object Person
     */
    @Override
    public String toString() {
        return "Person{" +
                "ID='" + ID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", title='" + title + '\'' +
                ", YOB=" + YOB +
                '}';
    }

    /**
     * @return return a CSV formatted String of the object Person
     */
    public String toCSV() {
        return ID + ", " + firstName + ", " + lastName + ", " + title + ", " + YOB;
    }

    /**
     * @return return a JSON formatted String of the object Person
     */
    public String toJSON() {
        return "{" +
                "\"ID\":\"" + ID + '\"' +
                ", \"firstName\":\"" + firstName + '\"' +
                ", \"lastName\":\"" + lastName + '\"' +
                ", \"title\":\"" + title + '\"' +
                ", \"YOB\":" + YOB +
                '}';
    }

    /**
     * @return return an XML formatted String of the object Person
     */
    public String toMXL() {
        return "<Person>" +
                "<ID>" + ID + "</ID>" +
                "<firstName>" + firstName + "</firstName>" +
                "<lastName>" + lastName + "</lastName>" +
                "<title>" + title + "</title>" +
                "<YOB>" + YOB + "</YOB>" +
                "</Person>";
    }
}