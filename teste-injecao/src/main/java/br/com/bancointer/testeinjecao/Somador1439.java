package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1439")
public class Somador1439 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
