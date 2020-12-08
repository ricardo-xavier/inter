package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1825")
public class Somador1825 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
