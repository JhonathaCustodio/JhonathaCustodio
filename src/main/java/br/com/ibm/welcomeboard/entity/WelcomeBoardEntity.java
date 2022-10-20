package br.com.ibm.welcomeboard.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tb_client")
public class WelcomeBoardEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private Long password;

    public WelcomeBoardEntity() {
    }

    public WelcomeBoardEntity(Long id, String name, String email, Long password) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Long getPassword() {
        return password;
    }

    public void setPassword(Long password) {
        this.password = password;
    }
}
