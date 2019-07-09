package ro.jademy.carrental;

import java.util.Objects;

public class Salesman extends Person {

    private String username;
    private String password;

    public Salesman(String firstName, String lastName, String username, String password) {
        super(firstName, lastName);
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Salesman salesman = (Salesman) o;
        return username.equals(salesman.username) &&
                password.equals(salesman.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), username, password);
    }

    @Override
    public String toString() {
        return "Salesman{" +
                "username=" + username +
                ", password='" + password + '\'' +
                '}';
    }
}
