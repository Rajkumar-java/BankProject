package Bank.BankManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Bank.BankManagement.Entity.Account;

public interface AccountRepository extends JpaRepository<Account,Long>
{

}
