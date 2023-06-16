package com.example.springdata;

import com.example.springdata.entity.Account;
import com.example.springdata.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.annotation.Transactional;

import java.util.Map;

@SpringBootApplication
public class SpringDataApplication implements CommandLineRunner {
    public static void main(String[] args) {
        SpringApplication.run(SpringDataApplication.class, args);
    }

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private AccountRepository accountRepository;

    public SpringDataApplication(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    @Override
    public void run(String... args) throws Exception {
//        jdbcTemplate.execute("INSERT INTO Account (id, name, email, bill) VALUES (1, 'Lori', 'lori@adc.ru', 10000)");
//        Account accountById = findAccountById(1L);
//        System.out.println(accountById);

        for (int i = 0; i < 10; i++) {
            accountRepository.save(new Account(null, "Lori" + i, "lori@abc.ru", 100 * i));
        }

        System.out.println(accountRepository.findAccountByName("Lori1"));
        accountRepository.setNameFor(2L, "Baxter");
        System.out.println(accountRepository.findAccountByNameAndBill("Baxter", 100));
    }

    private Account findAccountById(Long accountId) {
        String query = "SELECT * FROM Account WHERE id = %s";
        Map<String, Object> resultSet = jdbcTemplate.queryForMap(String.format(query, accountId));
        Account account = new Account();
        account.setId(accountId);
        account.setName((String) resultSet.get("name"));
        account.setEmail((String) resultSet.get("email"));
        account.setBill((Integer) resultSet.get("bill"));
        return account;
    }
}