public abstract class User implements Authenticate {

    private String email;
    private String password;


    public boolean authenticate(){
        return false;
    }


    public String getEmail(){
        return email;
    }


}
