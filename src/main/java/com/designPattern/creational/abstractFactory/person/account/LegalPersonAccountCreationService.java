package com.designPattern.creational.abstractFactory.person.account;

import lombok.extern.slf4j.Slf4j;

/**
 * Responsável pela criação de conta para pessoa jurídica.
 */
@Slf4j
public class LegalPersonAccountCreationService implements PersonAccountCreationService {

    @Override
    public void createAccount() {
        log.info("criando conta de pessoa jurídica");
    }

}
