package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1363")
public class Somador1363 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
