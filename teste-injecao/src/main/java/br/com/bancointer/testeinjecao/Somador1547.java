package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1547")
public class Somador1547 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
