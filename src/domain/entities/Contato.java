package domain.entities;

public class Contato {

    private String email;
    private String telefone;
    private String celular;
    private Boolean celularWhatsApp;

    public Contato() {
    }

    public Contato(String email, String telefone, String celular, Boolean celularWhatsApp) {
        this.email = email;
        this.telefone = telefone;
        this.celular = celular;
        this.celularWhatsApp = celularWhatsApp;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Boolean getCelularWhatsApp() {
        return celularWhatsApp;
    }

    public void setCelularWhatsApp(Boolean celularWhatsApp) {
        this.celularWhatsApp = celularWhatsApp;
    }
}
