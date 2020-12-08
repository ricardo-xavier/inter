package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1373")
public class Somador1373 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
