package applicationa.demo.pegawai.repository;

import applicationa.demo.pegawai.model.PegawaiModel;
import org.springframework.data.repository.CrudRepository;

public interface PegawaiRepository extends CrudRepository<PegawaiModel, Long> {
}
