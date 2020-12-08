package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1018")
public class Somador1018 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
