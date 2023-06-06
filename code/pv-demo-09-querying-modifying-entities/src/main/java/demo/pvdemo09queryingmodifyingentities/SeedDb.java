package demo.pvdemo09queryingmodifyingentities;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class SeedDb {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @PostConstruct
    public void init(){
        jdbcTemplate.update("insert into RECIPES (name) values (?)", new Object[]{"Chicken masala"});
        jdbcTemplate.update("insert into RECIPES (name) values (?)", new Object[]{"Chicken Schezuan"});
    }
}
