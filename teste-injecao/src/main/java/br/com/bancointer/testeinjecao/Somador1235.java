package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1235")
public class Somador1235 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
