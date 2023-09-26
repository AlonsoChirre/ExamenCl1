package pe.Alonso.cibertec.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Clientes {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String names;
	
	@Size(min = 3, max = 30)
	private String Apellidos;
	
	@Email
	private String email;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecNac;
	
	@Size(min = 8, max = 8)
	private String Dni;
}
