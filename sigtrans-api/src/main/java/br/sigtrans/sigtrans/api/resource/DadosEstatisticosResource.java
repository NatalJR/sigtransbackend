package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Ocorrencia.DadosEstatisticos;
import io.gumga.application.GumgaService;
import io.gumga.presentation.GumgaAPI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estatisticos")
public class DadosEstatisticosResource extends GumgaAPI<DadosEstatisticos, String> {
    @Autowired
    public DadosEstatisticosResource(@Qualifier("dadosEstatisticosService") GumgaService<DadosEstatisticos, String> service) {
        super(service);
    }

//    @RequestMapping("byid")
//    public List<DadosEstatisticos> buscaEstatisticos(@RequestParam String id){
//        return ((DadosEstatisticosService) service).buscaDadosEstatisticos(id);
//    }
}
