package demo.di.constructor;

import org.springframework.stereotype.Repository;

@Repository
public class BankRepository {
    public BankRepository(){
        System.out.println("BankRepository created");
    }
    public String getInfo(){
        return "Repository that was autowired in constructor";
    }

}
