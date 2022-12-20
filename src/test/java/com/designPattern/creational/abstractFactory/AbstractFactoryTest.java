package com.designPattern.creational.abstractFactory;

import com.designPattern.creational.abstractFactory.person.PersonCreationService;
import com.designPattern.creational.abstractFactory.person.account.LegalPersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.account.NaturalPersonAccountCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.LegalPersonCadastreCreationService;
import com.designPattern.creational.abstractFactory.person.cadastre.NaturalPersonCadastreCreationService;
import com.designPattern.creational.abstractFactory.person.factory.LegalPersonFactory;
import com.designPattern.creational.abstractFactory.person.factory.NaturalPersonFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * O Abstract Factory, também conhecido como Fábrica Abstrata,
 * é um padrão de projeto criacional que permite
 * produzir famílias de objetos relacionados sem ter que especificar as classes concretas.
 */
@RunWith(MockitoJUnitRunner.class)
public class AbstractFactoryTest {

    @Mock
    private LegalPersonFactory legalPersonFactory;

    @Mock
    private LegalPersonCadastreCreationService legalPersonCadastreCreationService;

    @Mock
    private LegalPersonAccountCreationService legalPersonAccountCreationService;

    @Mock
    private NaturalPersonFactory naturalPersonFactory;

    @Mock
    private NaturalPersonCadastreCreationService naturalPersonCadastreCreationService;

    @Mock
    private NaturalPersonAccountCreationService naturalPersonAccountCreationService;

    @Before
    public void init() {
        Mockito.when(legalPersonFactory.newPersonCadastreCreationService()).thenReturn(legalPersonCadastreCreationService);

        Mockito.when(legalPersonFactory.newPersonAccountCreationService()).thenReturn(legalPersonAccountCreationService);

        Mockito.when(naturalPersonFactory.newPersonCadastreCreationService()).thenReturn(naturalPersonCadastreCreationService);

        Mockito.when(naturalPersonFactory.newPersonAccountCreationService()).thenReturn(naturalPersonAccountCreationService);
    }

    /**
     * Deve testar se os métodos específicos de cada implementação foram chamados,
     * para criação de cadastro e criação de conta, correspondente com o tipo de pessoa.
     */
    @Test
    public void test() {
        final PersonCreationService legalPersonCreationService = new PersonCreationService(legalPersonFactory);
        Mockito.verify(legalPersonFactory, Mockito.times(1)).newPersonCadastreCreationService();
        Mockito.verify(legalPersonFactory, Mockito.times(1)).newPersonAccountCreationService();
        legalPersonCreationService.create();
        Mockito.verify(legalPersonCadastreCreationService, Mockito.times(1)).createCadastre();
        Mockito.verify(legalPersonAccountCreationService, Mockito.times(1)).createAccount();

        final PersonCreationService naturalPersonCreationService = new PersonCreationService(naturalPersonFactory);
        Mockito.verify(naturalPersonFactory, Mockito.times(1)).newPersonCadastreCreationService();
        Mockito.verify(naturalPersonFactory, Mockito.times(1)).newPersonAccountCreationService();
        naturalPersonCreationService.create();
        Mockito.verify(naturalPersonCadastreCreationService, Mockito.times(1)).createCadastre();
        Mockito.verify(naturalPersonAccountCreationService, Mockito.times(1)).createAccount();
    }

}