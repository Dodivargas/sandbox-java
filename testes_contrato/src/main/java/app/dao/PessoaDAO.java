package app.dao;

import app.modelo.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Repository
public class PessoaDAO {


    @Autowired
    JdbcTemplate jdbcTemplate;

    SimpleJdbcInsert jdbcInsert;

    public void cadastraPessoa(Pessoa pessoa) {
        Map<String,Object> parameters = new HashMap();
        parameters.put("nome", pessoa.getNome());
        parameters.put("cpf", pessoa.getCpf());

        jdbcInsert = new SimpleJdbcInsert(jdbcTemplate).withTableName("pessoas");

        ArrayList<String> keys = new ArrayList<>(parameters.keySet());

        jdbcInsert.setColumnNames(keys);
        jdbcInsert.execute(parameters);
    }

}
