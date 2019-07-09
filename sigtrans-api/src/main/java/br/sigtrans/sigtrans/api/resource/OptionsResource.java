package br.sigtrans.sigtrans.api.resource;

import br.sigtrans.sigtrans.service.*;
import io.gumga.core.QueryObject;
import io.gumga.core.gquery.GQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class OptionsResource {

    //lista de todos os dados que estarão nas options
    private EstadoService estado;
    private MunicipioService municipio;
    private BairroService bairro;
    private RuaService rua;
    private AcidenteTrabalhoService acidenteTrabalho;
    private ClassificacaoAcidenteService classificacaoAcidente;
    private CondicoesClimaticasService condicaoClimatica;
    private CondicaoTecnicaService condicaoTecnica;
    private SinalizacaoService sinalizacao;
    private VisibilidadeService visibilidade;
    private PerfilPistaService perfilPista;
    private SemaforoService semaforo;
    private SeparacaoPistaService separacaoPista;
    private EquipamentoControleTrafegoService equipamentoControleTrafego;
    private SinaisPneusService sinaisPneus;
    private AcostamentoService acostamento;
    private PavimentacaoService pavimentacao;
    private TipoViaService tipoVia;
    private ConservacaoViaService conservacaoVia;
    private SentidoViaService sentidoVia;
    private TipoAcidenteService tipoAcidente;
    private MarcaVeiculoService marca;
    private ModeloVeiculoService modelo;
    private CategoriaVeiculoService categoriaVeiculo;
    private GrauInstrucaoService grauInstrucao;
    private CondicaoSegurancaService condicaoSeguranca;
    private PosicaoVeiculoService posicaoVeiculo;
    private LesoesService lesao;
    private LocalEncaminhadoService localEncaminhado;
    private SuperficieService superficie;

    @Autowired
    public OptionsResource(EstadoService estado, MunicipioService municipio, BairroService bairro, RuaService rua, AcidenteTrabalhoService acidenteTrabalho, ClassificacaoAcidenteService classificacaoAcidente, CondicoesClimaticasService condicaoClimatica, CondicaoTecnicaService condicaoTecnica, SinalizacaoService sinalizacao, VisibilidadeService visibilidade, PerfilPistaService perfilPista, SemaforoService semaforo, SeparacaoPistaService separacaoPista, EquipamentoControleTrafegoService equipamentoControleTrafego, SinaisPneusService sinaisPneus, AcostamentoService acostamento, PavimentacaoService pavimentacao, TipoViaService tipoVia, ConservacaoViaService conservacaoVia, SentidoViaService sentidoVia, TipoAcidenteService tipoAcidente, MarcaVeiculoService marca, ModeloVeiculoService modelo, CategoriaVeiculoService categoriaVeiculo, GrauInstrucaoService grauInstrucao, CondicaoSegurancaService condicaoSeguranca, PosicaoVeiculoService posicaoVeiculo, LesoesService lesao, LocalEncaminhadoService localEncaminhado, SuperficieService superficie) {
        this.estado = estado;
        this.municipio = municipio;
        this.bairro = bairro;
        this.rua = rua;
        this.acidenteTrabalho = acidenteTrabalho;
        this.classificacaoAcidente = classificacaoAcidente;
        this.condicaoClimatica = condicaoClimatica;
        this.condicaoTecnica = condicaoTecnica;
        this.sinalizacao = sinalizacao;
        this.visibilidade = visibilidade;
        this.perfilPista = perfilPista;
        this.semaforo = semaforo;
        this.separacaoPista = separacaoPista;
        this.equipamentoControleTrafego = equipamentoControleTrafego;
        this.sinaisPneus = sinaisPneus;
        this.acostamento = acostamento;
        this.pavimentacao = pavimentacao;
        this.tipoVia = tipoVia;
        this.conservacaoVia = conservacaoVia;
        this.sentidoVia = sentidoVia;
        this.tipoAcidente = tipoAcidente;
        this.marca = marca;
        this.modelo = modelo;
        this.categoriaVeiculo = categoriaVeiculo;
        this.grauInstrucao = grauInstrucao;
        this.condicaoSeguranca = condicaoSeguranca;
        this.posicaoVeiculo = posicaoVeiculo;
        this.lesao = lesao;
        this.localEncaminhado = localEncaminhado;
        this.superficie = superficie;
    }


    @RequestMapping(value = "/options", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public Map getService() {

        GQuery gQuery = new GQuery();
        QueryObject queryObject = new QueryObject();
        queryObject.setgQuery(gQuery);

        //numero grande para pegar todas as opções possiveis
        //PODE SER NECESSARIO ALTERAÇÔES
        queryObject.setPageSize(Integer.MAX_VALUE);

        //busca
//        List<Estado> estados = estado.pesquisa(queryObject).getValues();
//        List<TipoAcidente> tipoAcidentes = tipoAcidente.pesquisa(queryObject).getValues();

        //transformar em JSON
        HashMap<String, List> map = new HashMap<>();
        map.put("estado", estado.pesquisa(queryObject).getValues());
//        map.put("municipio", municipio.pesquisa(queryObject).getValues());
//        map.put("bairro", bairro.pesquisa(queryObject).getValues());
//        map.put("rua", rua.pesquisa(queryObject).getValues());
        map.put("acidenteTrabalho", acidenteTrabalho.pesquisa(queryObject).getValues());
        map.put("classificacaoAcidente", classificacaoAcidente.pesquisa(queryObject).getValues());
        map.put("condicaoClimatica", condicaoClimatica.pesquisa(queryObject).getValues());
        map.put("condicaoTecnica", condicaoTecnica.pesquisa(queryObject).getValues());
        map.put("perfilPista", perfilPista.pesquisa(queryObject).getValues());
        map.put("semaforo", semaforo.pesquisa(queryObject).getValues());
        map.put("separacaoPista", separacaoPista.pesquisa(queryObject).getValues());
        map.put("equipamentoControleTrafego", equipamentoControleTrafego.pesquisa(queryObject).getValues());
        map.put("sinaisPneus", sinaisPneus.pesquisa(queryObject).getValues());
        map.put("acostamento", acostamento.pesquisa(queryObject).getValues());
        map.put("pavimentacao", pavimentacao.pesquisa(queryObject).getValues());
        map.put("tipoVia", tipoVia.pesquisa(queryObject).getValues());
        map.put("conservacaoVia", conservacaoVia.pesquisa(queryObject).getValues());
        map.put("sentidoVia", sentidoVia.pesquisa(queryObject).getValues());
        map.put("tipoAcidente", tipoAcidente.pesquisa(queryObject).getValues());
        map.put("marca", marca.pesquisa(queryObject).getValues());
        map.put("modelo", modelo.pesquisa(queryObject).getValues());
        map.put("categoriaVeiculo", categoriaVeiculo.pesquisa(queryObject).getValues());
        map.put("grauInstrucao", grauInstrucao.pesquisa(queryObject).getValues());
        map.put("condicaoSeguranca", condicaoSeguranca.pesquisa(queryObject).getValues());
        map.put("posicaoVeiculo", posicaoVeiculo.pesquisa(queryObject).getValues());
        map.put("lesao", lesao.pesquisa(queryObject).getValues());
        map.put("localEncaminhado", localEncaminhado.pesquisa(queryObject).getValues());
        map.put("sinalizacao", sinalizacao.pesquisa(queryObject).getValues());
        map.put("superficie", superficie.pesquisa(queryObject).getValues());
        map.put("visibilidade", visibilidade.pesquisa(queryObject).getValues());
        return map;
    }

    public EstadoService getEstado() {
        return estado;
    }

    public void setEstado(EstadoService estado) {
        this.estado = estado;
    }

    public MunicipioService getMunicipio() {
        return municipio;
    }

    public void setMunicipio(MunicipioService municipio) {
        this.municipio = municipio;
    }

    public BairroService getBairro() {
        return bairro;
    }

    public void setBairro(BairroService bairro) {
        this.bairro = bairro;
    }

    public RuaService getRua() {
        return rua;
    }

    public void setRua(RuaService rua) {
        this.rua = rua;
    }

    public AcidenteTrabalhoService getAcidenteTrabalho() {
        return acidenteTrabalho;
    }

    public void setAcidenteTrabalho(AcidenteTrabalhoService acidenteTrabalho) {
        this.acidenteTrabalho = acidenteTrabalho;
    }

    public ClassificacaoAcidenteService getClassificacaoAcidente() {
        return classificacaoAcidente;
    }

    public void setClassificacaoAcidente(ClassificacaoAcidenteService classificacaoAcidente) {
        this.classificacaoAcidente = classificacaoAcidente;
    }

    public CondicoesClimaticasService getCondicaoClimatica() {
        return condicaoClimatica;
    }

    public void setCondicaoClimatica(CondicoesClimaticasService condicaoClimatica) {
        this.condicaoClimatica = condicaoClimatica;
    }

    public CondicaoTecnicaService getCondicaoTecnica() {
        return condicaoTecnica;
    }

    public void setCondicaoTecnica(CondicaoTecnicaService condicaoTecnica) {
        this.condicaoTecnica = condicaoTecnica;
    }

    public SinalizacaoService getSinalizacao() {
        return sinalizacao;
    }

    public void setSinalizacao(SinalizacaoService sinalizacao) {
        this.sinalizacao = sinalizacao;
    }

    public VisibilidadeService getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(VisibilidadeService visibilidade) {
        this.visibilidade = visibilidade;
    }

    public PerfilPistaService getPerfilPista() {
        return perfilPista;
    }

    public void setPerfilPista(PerfilPistaService perfilPista) {
        this.perfilPista = perfilPista;
    }

    public SemaforoService getSemaforo() {
        return semaforo;
    }

    public void setSemaforo(SemaforoService semaforo) {
        this.semaforo = semaforo;
    }

    public SeparacaoPistaService getSeparacaoPista() {
        return separacaoPista;
    }

    public void setSeparacaoPista(SeparacaoPistaService separacaoPista) {
        this.separacaoPista = separacaoPista;
    }

    public EquipamentoControleTrafegoService getEquipamentoControleTrafego() {
        return equipamentoControleTrafego;
    }

    public void setEquipamentoControleTrafego(EquipamentoControleTrafegoService equipamentoControleTrafego) {
        this.equipamentoControleTrafego = equipamentoControleTrafego;
    }

    public SinaisPneusService getSinaisPneus() {
        return sinaisPneus;
    }

    public void setSinaisPneus(SinaisPneusService sinaisPneus) {
        this.sinaisPneus = sinaisPneus;
    }

    public AcostamentoService getAcostamento() {
        return acostamento;
    }

    public void setAcostamento(AcostamentoService acostamento) {
        this.acostamento = acostamento;
    }

    public PavimentacaoService getPavimentacao() {
        return pavimentacao;
    }

    public void setPavimentacao(PavimentacaoService pavimentacao) {
        this.pavimentacao = pavimentacao;
    }

    public TipoViaService getTipoVia() {
        return tipoVia;
    }

    public void setTipoVia(TipoViaService tipoVia) {
        this.tipoVia = tipoVia;
    }

    public ConservacaoViaService getConservacaoVia() {
        return conservacaoVia;
    }

    public void setConservacaoVia(ConservacaoViaService conservacaoVia) {
        this.conservacaoVia = conservacaoVia;
    }

    public SentidoViaService getSentidoVia() {
        return sentidoVia;
    }

    public void setSentidoVia(SentidoViaService sentidoVia) {
        this.sentidoVia = sentidoVia;
    }

    public TipoAcidenteService getTipoAcidente() {
        return tipoAcidente;
    }

    public void setTipoAcidente(TipoAcidenteService tipoAcidente) {
        this.tipoAcidente = tipoAcidente;
    }

    public MarcaVeiculoService getMarca() {
        return marca;
    }

    public void setMarca(MarcaVeiculoService marca) {
        this.marca = marca;
    }

    public ModeloVeiculoService getModelo() {
        return modelo;
    }

    public void setModelo(ModeloVeiculoService modelo) {
        this.modelo = modelo;
    }

    public CategoriaVeiculoService getCategoriaVeiculo() {
        return categoriaVeiculo;
    }

    public void setCategoriaVeiculo(CategoriaVeiculoService categoriaVeiculo) {
        this.categoriaVeiculo = categoriaVeiculo;
    }

    public GrauInstrucaoService getGrauInstrucao() {
        return grauInstrucao;
    }

    public void setGrauInstrucao(GrauInstrucaoService grauInstrucao) {
        this.grauInstrucao = grauInstrucao;
    }

    public CondicaoSegurancaService getCondicaoSeguranca() {
        return condicaoSeguranca;
    }

    public void setCondicaoSeguranca(CondicaoSegurancaService condicaoSeguranca) {
        this.condicaoSeguranca = condicaoSeguranca;
    }

    public PosicaoVeiculoService getPosicaoVeiculo() {
        return posicaoVeiculo;
    }

    public void setPosicaoVeiculo(PosicaoVeiculoService posicaoVeiculo) {
        this.posicaoVeiculo = posicaoVeiculo;
    }

    public LesoesService getLesao() {
        return lesao;
    }

    public void setLesao(LesoesService lesao) {
        this.lesao = lesao;
    }

    public LocalEncaminhadoService getLocalEncaminhado() {
        return localEncaminhado;
    }

    public void setLocalEncaminhado(LocalEncaminhadoService localEncaminhado) {
        this.localEncaminhado = localEncaminhado;
    }
}
