package com.designPattern.creational.abstractFactory.person.cadastre;

import lombok.extern.slf4j.Slf4j;

/**
 * Responsável pela criação de cadastro de pessoa jurídica.
 */
@Slf4j
public class LegalPersonCadastreCreationService implements PersonCadastreCreationService {

    @Override
    public void createCadastre() {
        log.info("criando cadastro de pessoa jurídica");
    }

}
