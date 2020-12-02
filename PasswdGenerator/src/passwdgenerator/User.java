package passwdgenerator;
//klasi user me metavlites constructor,setters-getters kai toString
public class User {
    private String firstname;
    private String lastname;
    private String petsname;
    
    public User(String firstname,String lastname,String petsname){
    this.firstname = firstname;
    this.lastname = lastname;
    this.petsname = petsname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setPetsname(String petsname) {
        this.petsname = petsname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPetsname() {
        return petsname;
    }

    @Override
    public String toString() {
        return "User{" + "firstname=" + firstname + ", lastname=" + lastname + ", petsname=" + petsname + '}';
    }
    

}
