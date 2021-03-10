package applicationa.demo.pegawai.service;

import applicationa.demo.pegawai.form.PegawaiForm;
import applicationa.demo.pegawai.model.PegawaiModel;

import java.util.Optional;

public interface PegawaiSvc {
	
	Optional<PegawaiModel> getById(Long id);
	
	PegawaiModel save(PegawaiForm form);
}
