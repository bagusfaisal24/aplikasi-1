package applicationa.demo.pegawai.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pegawai")
@Setter
@Getter
public class PegawaiModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NAME", nullable = false)
	private String name;
	
	@Column(name = "ALAMAT", nullable = false)
	private String alamat;
}
