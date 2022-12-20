package com.designPattern.creational.abstractFactory.person.factory;

import com.designPattern.creational.abstractFactory.person.account.LegalPersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.account.PersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.LegalPersonCadastreCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.PersonCadastreCreationService;

/**
 * Representa a fábrica para criação de objetos relacionados a pessoa jurídica.
 */
public class LegalPersonFactory implements PersonFactory {

    @Override
    public PersonCadastreCreationService newPersonCadastreCreationService() {
        return new LegalPersonCadastreCreationService();
    }

    @Override
    public PersonAccountCreationService newPersonAccountCreationService() {
        return new LegalPersonAccountCreationService();
    }

}