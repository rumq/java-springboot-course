package demo.di.finetuning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        BankService primary = ctx.getBean(BankService.class,"primaryRepository");

        primary.printRepositoryInfo();
        // secondary.printRepositoryInfo();

    }

}
