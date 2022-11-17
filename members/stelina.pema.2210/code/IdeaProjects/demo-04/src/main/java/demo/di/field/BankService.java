package demo.di.field;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    @Autowired
    private BankRepository repository;

    public void printRepositoryInfo(){
        System.out.println(repository.getInfo());
    }

}
