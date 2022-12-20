package com.designPattern.creational.abstractFactory.person.account;

import lombok.extern.slf4j.Slf4j;

/**
 * Responsável pela criação de conta para pessoa física.
 */
@Slf4j
public class NaturalPersonAccountCreationService implements PersonAccountCreationService {

    @Override
    public void createAccount() {
        log.info("criando conta de pessoa física");
    }

}
