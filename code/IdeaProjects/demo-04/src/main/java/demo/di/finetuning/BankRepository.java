package demo.di.finetuning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class BankRepository {


    public BankRepository(){
        System.out.println("BankRepository created");
    }
    public String getInfo(){
        return "Repository that was autowired in contructor - finetuning" + this.hashCode();
    }

}
