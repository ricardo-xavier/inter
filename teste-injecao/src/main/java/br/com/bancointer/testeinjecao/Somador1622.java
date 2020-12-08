package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1622")
public class Somador1622 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
