package dssc.assignment.bank.parse;

import dssc.assignment.bank.AccountNumber;
import dssc.assignment.bank.Entry;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintAccountNumberTest {

    @Test
    void allZerosEntry() {
        Entry entry = new Entry(" _  _  _  _  _  _  _  _  _ ","| || || || || || || || || |","|_||_||_||_||_||_||_||_||_|");
        assertEquals("000000000", new AccountNumber(entry).toString());
    }

    @Test
    void allOnesEntry() {
        Entry entry = new Entry("                           ", "  |  |  |  |  |  |  |  |  |", "  |  |  |  |  |  |  |  |  |");
        assertEquals("111111111", new AccountNumber(entry).toString());
    }

    @Test
    void zeroAndOnePattern() {
        Entry entry = new Entry(" _     _     _     _     _ ", "| |  || |  || |  || |  || |", "|_|  ||_|  ||_|  ||_|  ||_|");
        assertEquals("010101010", new AccountNumber(entry).toString());
    }

    @Test
    void threeAndSevenEntry() {
        Entry entry = new Entry(" _  _  _  _  _  _  _  _  _ ", " _|  | _|  | _|  | _|  | _|", " _|  | _|  | _|  | _|  | _|");
        assertEquals("373737373", new AccountNumber(entry).toString());
    }
}
