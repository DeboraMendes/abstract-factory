package com.designPattern.creational.abstractFactory.person;

import com.designPattern.creational.abstractFactory.person.account.PersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.PersonCadastreCreationService;
import com.designPattern.creational.abstractFactory.person.factory.PersonFactory;

/**
 * Responsável pela criação de objetos relacionados a pessoa.
 */
public class PersonCreationService {

    private final PersonCadastreCreationService personCadastreCreationService;
    private final PersonAccountCreationService personAccountCreationService;

    public PersonCreationService(PersonFactory personFactory) {
        personCadastreCreationService = personFactory.newPersonCadastreCreationService();
        personAccountCreationService = personFactory.newPersonAccountCreationService();
    }

    public void create() {
        personCadastreCreationService.createCadastre();
        personAccountCreationService.createAccount();
    }

}