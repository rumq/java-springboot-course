package demo.pv10springdatarepositories;

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
        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Chicken masala", "NONVEG", "LOW"});
        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Chicken masala", "NONVEG", "LOW"});
        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Chicken Schezuan", "NONVEG", "LOW"});
        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Veg Schezuan", "VEG", "MID"});
        jdbcTemplate.update("insert into RECIPES (name, type, spice_level) values (?, ?, ?)", new Object[]{"Veg Hakka", "VEG", "MID"});
//        jdbcTemplate.update("insert into RECIPES (name) values (?, ?, >)", new Object[]{"Chicken Schezuan", "NONVEG", "LOW"});
    }
}
