package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1828")
public class Somador1828 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
