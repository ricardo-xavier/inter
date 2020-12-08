package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1588")
public class Somador1588 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
