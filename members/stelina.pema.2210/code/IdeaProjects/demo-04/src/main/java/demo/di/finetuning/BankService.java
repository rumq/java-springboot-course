package demo.di.finetuning;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class BankService {

    @Qualifier("primaryRepository")
    private final BankRepository repository1;
    @Qualifier("secondaryRepository")
    private final BankRepository repository2;

    public BankService(BankRepository repository, BankRepository repository2) {
        this.repository1 = repository;
        this.repository2 = repository2;
    }

    public void printRepositoryInfo(){

        System.out.println(repository1.getInfo());
        System.out.println(repository2.getInfo());
    }

}
