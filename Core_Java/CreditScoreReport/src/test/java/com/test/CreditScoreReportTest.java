package com.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.exception.InvalidConsumerException;
import com.model.Consumer;
import com.util.CreditScoreReport;

class CreditScoreReportTest {
    private CreditScoreReport creditScoreReport;

    @BeforeEach
    void setUp() {
        creditScoreReport = new CreditScoreReport();
        List<Consumer> consumerList = new ArrayList<>();
        consumerList.add(new Consumer("C001", "John Doe", "1990-01-01", "123456789", 5000.0, 850));
        consumerList.add(new Consumer("C002", "Jane Doe", "1992-02-02", "987654321", 6000.0, 750));
        consumerList.add(new Consumer("C003", "Alice Smith", "1985-03-03", "456123789", 7000.0, 550));
        consumerList.add(new Consumer("C004", "Bob Johnson", "1988-04-04", "321654987", 8000.0, 450));
        creditScoreReport.setConsumerList(consumerList);
    }

    @Test
    void test11TotalConsumerCountForEachCreditScoreRange() throws InvalidConsumerException {
        Map<Integer, Integer> result = creditScoreReport.totalConsumerCountForEachCreditScoreRange();

        assertNotNull(result, "Result map should not be null");

        assertTrue(result.containsKey(800), "Key 800 should exist in the result map");
        assertTrue(result.containsKey(600), "Key 600 should exist in the result map");
        assertTrue(result.containsKey(500), "Key 500 should exist in the result map");
        assertTrue(result.containsKey(300), "Key 300 should exist in the result map");

        assertNotNull(result.get(800), "Value for key 800 should not be null");
        assertNotNull(result.get(600), "Value for key 600 should not be null");
        assertNotNull(result.get(500), "Value for key 500 should not be null");
        assertNotNull(result.get(300), "Value for key 300 should not be null");

        assertEquals(1, result.get(800));
        assertEquals(1, result.get(600));
        assertEquals(1, result.get(500));
        assertEquals(1, result.get(300));
    }


    @Test
    void test12TotalConsumerCountForEachCreditScoreRangeForEmptyList() {
        creditScoreReport.setConsumerList(new ArrayList<>());
        assertThrows(InvalidConsumerException.class, () -> creditScoreReport.totalConsumerCountForEachCreditScoreRange());
    }

    @Test
    void test13ViewConsumerReportBasedOnCreditScoreWhenExcellent() throws InvalidConsumerException {
        assertEquals("EXCELLENT", creditScoreReport.viewConsumerReportBasedOnCreditScore(850));
    }

    @Test
    void test14ViewConsumerReportBasedOnCreditScoreWhenGood() throws InvalidConsumerException {
        assertEquals("GOOD", creditScoreReport.viewConsumerReportBasedOnCreditScore(750));
    }

    @Test
    void test15ViewConsumerReportBasedOnCreditScoreWhenFair() throws InvalidConsumerException {
        assertEquals("FAIR", creditScoreReport.viewConsumerReportBasedOnCreditScore(550));
    }

    @Test
    void test16ViewConsumerReportBasedOnCreditScoreWhenPoor() throws InvalidConsumerException {
        assertEquals("POOR", creditScoreReport.viewConsumerReportBasedOnCreditScore(450));
    }

    @Test
    void test17ViewConsumerReportBasedOnCreditScoreForEmptyList() {
        creditScoreReport.setConsumerList(new ArrayList<>()); 
        Exception exception = assertThrows(InvalidConsumerException.class, () -> {
            creditScoreReport.viewConsumerReportBasedOnCreditScore(750);
        });

        assertEquals("Consumer list is empty", exception.getMessage());
    }
}
