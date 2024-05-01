package ads.poo;

public class Email {
    
    private String pessoal;
    private String email;
    
    public Email(String pessoal, String email) {
        this.pessoal = pessoal;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Email [pessoal=" + pessoal + ", email=" + email + "]";
    }
}
