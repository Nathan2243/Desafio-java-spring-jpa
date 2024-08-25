package digital.inovationone.gof.dataprovider;

import digital.inovationone.gof.model.Cliente;

public interface ClienteService {
    Iterable<Cliente> buscarTodos();

    Cliente buscarPorId(Long id);

    void inserir(Cliente cLiente);

    void atualizar(Long id, Cliente cliente);

    void deletar(Long id);

}
