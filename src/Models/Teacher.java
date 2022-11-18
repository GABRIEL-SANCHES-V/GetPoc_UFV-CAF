package Models;

public class Teacher extends Person{

    public Teacher(String idRegistration, String cpf, String name, String password, String email) {
        super(idRegistration, cpf, name, password, TypeUser.TEACHER, email);
    }

    @Override
    public void setIdRegistration(String idRegistration) {
        this.idRegistration = idRegistration;
    }

    @Override
    public String getIdRegistration() {
        return idRegistration;
    }

    @Override
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public TypeUser getTypePerson() {
        return typeUser;
    }

    @Override
    public void setTypePerson(TypeUser typeUser) {
        this.typeUser = typeUser;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }
}
