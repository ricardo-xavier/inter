package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1421")
public class Somador1421 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
