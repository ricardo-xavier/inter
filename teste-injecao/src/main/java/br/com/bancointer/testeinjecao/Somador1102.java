package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1102")
public class Somador1102 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
