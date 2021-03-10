package applicationa.demo.pegawai.service;

import applicationa.demo.pegawai.form.PegawaiForm;
import applicationa.demo.pegawai.model.PegawaiModel;
import applicationa.demo.pegawai.repository.PegawaiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PegawaiSvcImpl implements PegawaiSvc {

	@Autowired
	private PegawaiRepository pegawaiRepository;
	
	@Override
	public Optional<PegawaiModel> getById(Long id) {
		return pegawaiRepository.findById(id);
	}
	
	@Override
	public PegawaiModel save(PegawaiForm form) {
		PegawaiModel pegawai = new PegawaiModel();
		pegawai.setName(form.getName());
		pegawai.setAlamat(form.getAlamat());
		return pegawaiRepository.save(pegawai);
	}
}
