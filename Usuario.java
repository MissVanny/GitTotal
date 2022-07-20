package A3PSC;

public class Usuario {

    //Atributos
    protected String email, senha;
    protected int telefone;

    //Construtores
    public Usuario() {
        
    }

    public Usuario(String email, String senha) {
        this.email = email;
        this.senha = senha;
    }

    public Usuario(String email, String senha, int telefone) {
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
    }

    //Métodos
     public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
}