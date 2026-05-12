package com.pragma.loansystem.integration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import com.pragma.loansystem.service.LoanService;

public class LoanSystemIntegrationTest {
    private final LoanService loanService = new LoanService();

    @Test
    public void testProcessLoanIntegration() {
        String result = loanService.processLoan("loanData");
        assertEquals("Préstamo procesado", result);
    }
}