package br.com.dodivargas.pitests;

import org.junit.Test;

import static org.junit.Assert.*;

public class PitestTest {

    @Test
    public void testFalse() {
        boolean deveEsfriar = Pitest.deveEsfriarReator(900);
        assertFalse(deveEsfriar);
    }

    @Test
    public void testTrue() {
        boolean deveEsfriar = Pitest.deveEsfriarReator(1001);
        assertTrue(deveEsfriar);
    }

    @Test
    public void testEquals() {
        boolean deveEsfriar = Pitest.deveEsfriarReator(1000);
        assertFalse(deveEsfriar);
    }


}