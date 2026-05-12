package com.pragma.loansystem.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LoanServiceTest {
    @Mock
    private LoanService loanService;

    public LoanServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testProcessLoan() {
        when(loanService.processLoan("loanData")).thenReturn("Préstamo procesado");
        assertEquals("Préstamo procesado", loanService.processLoan("loanData"));
    }
}