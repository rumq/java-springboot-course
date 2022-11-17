package demo.di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankService {
    private final BankRepository repository;

    public BankService(BankRepository repository) {
        this.repository = repository;
    }

    public void printRepositoryInfo(){
        System.out.println(repository.getInfo());
    }

}
