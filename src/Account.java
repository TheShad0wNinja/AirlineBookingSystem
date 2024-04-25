/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.time.LocalDate;
import java.util.Objects;

public abstract class Account {
    private String name;
    private String username;
    private String password;
    private LocalDate dob;

    public Account(String name, String username, String password, LocalDate dob) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public LocalDate getDob() {
        return dob;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, username, password, dob);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Account other = (Account) obj;
        return Objects.equals(this.username, other.username);
    }

    @Override
    public String toString() {
        return String.format("[1]Name: %s\n[2]Username: %s\n[3]Password: %s\n[4]LocalDate Of Birth: %s", name, username, password, dob.toString());
    }
}