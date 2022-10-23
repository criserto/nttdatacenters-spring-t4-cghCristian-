package nttdatacenters.spring.Entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name="client")
public class Client {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private Long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LASTNAME")
	private String lastname;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "La fecha no puede ser nula")
	@Column(name="BIRTH", nullable=true)
	private LocalDate dateBirth;
	
	@NotNull(message = "DNI no puede ser nulo.")
	@NotEmpty(message ="El DNI no puede estar en blanco")
    @Length(min = 9, max = 9, message="El código del producto tiene que tener entre 3 y 8 caracteres")
	@Column(name="DNI")
	private String dni;
}
