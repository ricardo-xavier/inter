package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1132")
public class Somador1132 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
