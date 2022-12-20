package com.designPattern.creational.abstractFactory.person.factory;

import com.designPattern.creational.abstractFactory.person.account.NaturalPersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.account.PersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.NaturalPersonCadastreCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.PersonCadastreCreationService;

/**
 * Representa a fábrica para criação de objetos relacionados a pessoa física.
 */
public class NaturalPersonFactory implements PersonFactory {

    @Override
    public PersonCadastreCreationService newPersonCadastreCreationService() {
        return new NaturalPersonCadastreCreationService();
    }

    @Override
    public PersonAccountCreationService newPersonAccountCreationService() {
        return new NaturalPersonAccountCreationService();
    }

}