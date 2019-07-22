/*
 * package br.com.seuaquario.service;
 * 
 * import java.util.List;
 * 
 * import org.slf4j.Logger; import org.slf4j.LoggerFactory; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import br.com.seuaquario.entity.Aquario; import
 * br.com.seuaquario.entity.Peixes; import
 * br.com.seuaquario.repository.AquarioRepository;
 * 
 * @Service public class AquarioService {
 * 
 * private Logger logger = LoggerFactory.getLogger(AquarioService.class);
 * 
 * @Autowired public AquarioRepository aquarioRepository;
 * 
 * public List<Aquario> salvarAquario(List<Aquario> aquarios) { return
 * aquarioRepository.saveAll(aquarios); }
 * 
 * public void deletarAquario(Aquario aquario) { try {
 * aquarioRepository.delete(aquario); } catch (Exception e) {
 * logger.error("DELTA - Erro ao salvar aquario "); } }
 * 
 * public List<Aquario> listAquarios() { return aquarioRepository.findAll(); }
 * 
 * public void updateAquario(Aquario aquario) { try {
 * aquarioRepository.save(aquario); } catch (Exception e) {
 * logger.error("DELTA - Erro ao salvar aquario "); } }
 * 
 * //TODO public List<Aquario> listByPeixe(List<Peixes> peixe) { return null; }
 * 
 * public List<Aquario> listByLitragem(String litragem) { return
 * aquarioRepository.findByLitragem(litragem); }
 * 
 * }
 */