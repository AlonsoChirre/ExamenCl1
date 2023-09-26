package pe.Alonso.cibertec.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Categorias {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ID;
	private String names;
}
