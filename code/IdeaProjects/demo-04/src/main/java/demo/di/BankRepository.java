package demo.di;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepository {
    public BankRepository(){
        System.out.println("BankRepository created");
    }
    public String getInfo(){
        return "Repository that was autowired";
    }

}
