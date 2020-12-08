package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1413")
public class Somador1413 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
