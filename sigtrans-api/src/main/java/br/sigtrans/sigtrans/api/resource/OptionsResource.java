package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.domain.Estado;
import br.sigtrans.sigtrans.domain.TipoAcidente;
import br.sigtrans.sigtrans.service.EstadoService;
import br.sigtrans.sigtrans.service.TipoAcidenteService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.gumga.core.QueryObject;
import io.gumga.core.gquery.GQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class OptionsResource {

    //lista de todos os dados que estarão nas options
    private EstadoService serviceEstado;
    private TipoAcidenteService serviceTipoAcidente;

    @Autowired
    public OptionsResource(EstadoService serviceEstado, TipoAcidenteService serviceTipoAcidente) {
        this.serviceEstado = serviceEstado;
        this.serviceTipoAcidente = serviceTipoAcidente;
    }

    @RequestMapping(value = "/options", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public String getService() throws IOException {

        GQuery gQuery = new GQuery();
        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);

        //numero grande para pegar todas as opções possiveis
        queryObject.setPageSize(500);

        //busca
        List<Estado> estados = serviceEstado.pesquisa(queryObject).getValues();
        List<TipoAcidente> tipoAcidentes = serviceTipoAcidente.pesquisa(queryObject).getValues();

        //transformar em JSON
        ObjectMapper mapper = new ObjectMapper();
        String result = mapper.writeValueAsString(estados);
        return result;
    }

    public EstadoService getServiceEstado() {
        return serviceEstado;
    }

    public void setServiceEstado(EstadoService serviceEstado) {
        this.serviceEstado = serviceEstado;
    }

    public TipoAcidenteService getServiceTipoAcidente() {
        return serviceTipoAcidente;
    }

    public void setServiceTipoAcidente(TipoAcidenteService serviceTipoAcidente) {
        this.serviceTipoAcidente = serviceTipoAcidente;
    }
}
