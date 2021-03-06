package com.dummy.api;

import com.dummy.api.models.BankCard;
import com.dummy.api.models.BankUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BankCardRepository extends JpaRepository<BankCard, Long> {

    Optional<BankCard> findByPin(int pin);

    BankUser findByBankUser(Long id);

    Optional<BankCard> findByBankCardNumber(Long bankCardNumber);

    Optional<BankCard> findByBankAccountNumber(Long bankaccountnumber);
}
