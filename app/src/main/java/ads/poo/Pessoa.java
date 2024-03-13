package ads.poo;

public class Pessoa {

    private String cpf ;
    private String name ;
    private String email ;


    // Método 
    
    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return "Pessoa [cpf=" + cpf + ", name=" + name + ", email=" + email + "]";
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    } 

}
