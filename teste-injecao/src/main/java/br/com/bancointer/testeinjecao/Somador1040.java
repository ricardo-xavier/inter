package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1040")
public class Somador1040 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
