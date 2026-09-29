public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;

    }
    // getter for name
    public String getname(){
        return name;
    }
    //setter for name
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    // setter for age
    public void setAge(int age){
        this.age = age;
    }
    // getter for email
    public String getEmail(){
        return email;
    }
    //setter for email
    public void setEmail(String email){
        this.email = email;
    }
    public void DisplayPersonDetails(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);

    }

    
}
