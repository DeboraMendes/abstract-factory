package com.designPattern.creational.abstractFactory.person.factory;

import com.designPattern.creational.abstractFactory.person.account.PersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.PersonCadastreCreationService;

/**
 * Representa a fábrica para criação de objetos relacionados a pessoa.
 */
public interface PersonFactory {

    PersonCadastreCreationService newPersonCadastreCreationService();

    PersonAccountCreationService newPersonAccountCreationService();

}
