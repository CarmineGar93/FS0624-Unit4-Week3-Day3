package CarmineGargiulo.entities;

import CarmineGargiulo.entities.Enums.Sesso;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "persons")
public class Persona {
    @Id
    @GeneratedValue
    @Column(name = "person_id")
    private UUID personaId;

    @Column(name = "name")
    private String nome;

    @Column(name = "surname")
    private String cognome;

    private String email;

    @Column(name = "birthday")
    private LocalDate dataNascita;

    @Column(name = "sex")
    @Enumerated(EnumType.STRING)
    private Sesso sesso;

    public Persona(){

    }
    public Persona(String nome, String cognome, String email, LocalDate dataNascita, Sesso sesso) {
        this.nome = nome;
        this.cognome = cognome;
        this.email = email;
        this.dataNascita = dataNascita;
        this.sesso = sesso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Sesso getSesso() {
        return sesso;
    }

    public void setSesso(Sesso sesso) {
        this.sesso = sesso;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }

    public UUID getPersonaId() {
        return personaId;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "personaId=" + personaId +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", email='" + email + '\'' +
                ", dataNascita=" + dataNascita +
                ", sesso=" + sesso +
                '}';
    }
}
