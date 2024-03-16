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
        return "Pessoa [\ncpf=" + cpf + ", \nname=" + name + ", \nemail=" + email + "]";
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

    public Pessoa(String cpf, String name, String email) {
        this.cpf = cpf;
        this.name = name;
        this.email = email;
    }
}
