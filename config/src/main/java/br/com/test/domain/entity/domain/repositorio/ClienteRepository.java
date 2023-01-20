//package br.com.test.domain.entity.domain.repositorio;
//
//import br.com.test.domain.entity.Cliente;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Repository;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//@Repository
//public class ClienteRepository {
//
//    private static String SELECT_ALL = "SELECT * FROM CLIENTE";
//    private static String INSERT = "INSERT INTO CLIENTE(NOME) VALUES(?)";
//    private static String UPDATE = "UPDATE CLIENTE SET NOME = ? WHERE ID = ?";
//
//    private static String DELETE = "DELETE FROM CLIENTE ";
//    @Autowired
//    private JdbcTemplate jdbcTemplate;
//    public Cliente salvar(Cliente cliente){
//        jdbcTemplate.update(INSERT,new Object[]{cliente.getName()});
//        return cliente;
//    }
//
//    public Cliente atualizar(Cliente cliente){
//        jdbcTemplate.update(UPDATE, new Object[]{cliente.getName(), cliente.getId()});
//        return cliente;
//    }
//
//    public void deletar(Cliente cliente){
//        this.deletar(cliente.getId());
//    }
//    public void deletar(Integer id){
//        jdbcTemplate.update(DELETE, new Object[]{id});
//    }
//
//
//    public List<Cliente> obterTodos(){
//        return jdbcTemplate.query(SELECT_ALL, this.obterTodosClientes());
//    }
//
//    public List<Cliente> obterTodosPorNome(){
//        return jdbcTemplate.query(SELECT_ALL.concat("where nome = ? "), this.obterTodosClientes());
//    }
//
//    public RowMapper<Cliente>obterTodosClientes(){
//        return new RowMapper<Cliente>() {
//            @Override
//            public Cliente mapRow(ResultSet rs, int rowNum) throws SQLException {
//                Integer id = rs.getInt("id");
//                String nome = rs.getString("nome");
//                return new Cliente(id, nome);
//            }
//        };
//    }
//
//}
