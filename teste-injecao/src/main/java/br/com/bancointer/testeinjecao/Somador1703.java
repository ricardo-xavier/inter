package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1703")
public class Somador1703 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
