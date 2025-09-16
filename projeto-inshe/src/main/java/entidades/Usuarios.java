package entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Usuarios {

    @Id               
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;
    public String nome;
    public String email;
    public String senha;
}
