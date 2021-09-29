package za.ac.nwu.as.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.as.domain.dto.AccountTypeDto;
import za.ac.nwu.as.translator.AccountTypeTranslator;
import za.ac.nwu.as.translator.AccountTypeTranslator;

import static org.junit.Assert.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {
    @Mock
    private AccountTypeTranslator mock;
    @InjectMocks
    private CreateAccountTypeFlowImpl classToTest;

    @Before
    public void setUp() throws Exception {
// What happens before each test
    }

    @After
    public void tearDown() throws Exception {
// What happens after each test
    }

    @Test
    public void test() {
// Write a test here
    }
}
