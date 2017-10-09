public class Person implements Greeter{
    protected String firstname;
    protected String lastname;

    public Person(){

    }
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        try {
            firstname.trim();
            lastname.trim();
        }catch(IllegalArgumentException e){
            System.out.println("not valid");
        }

    }

    public String firstName(){
        return this.firstname;
    }

    public String lastname(){
        return this.lastname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String sayHello(){
        return "Hello from " + this.firstname + " " + this.lastname;
    }

}
