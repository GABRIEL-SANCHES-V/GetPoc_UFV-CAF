package Models;

abstract class Person {

    protected String idRegistration;
    protected String cpf;
    protected String name;
    protected String password;
    protected TypeUser typeUser;
    protected String email;

    public Person(String idRegistration, String cpf, String name, String password, TypeUser typeUser, String email){
        this.idRegistration = idRegistration;
        this.cpf = cpf;
        this.name = name;
        this.password = password;
        this.typeUser = typeUser;
        this.email = email;
    }

    public abstract void setIdRegistration(String idRegistration);

    public abstract String getIdRegistration();

    public abstract void setCpf(String cpf);

    public abstract String getCpf();

    public abstract String getName();

    public abstract void setName(String name);

    public abstract void setPassword(String password);

    public abstract TypeUser getTypePerson();

    public abstract void setTypePerson(TypeUser typeUser);

    public abstract String getEmail();

    public abstract void setEmail(String email);
}
