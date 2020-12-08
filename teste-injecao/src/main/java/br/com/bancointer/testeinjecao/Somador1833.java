package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1833")
public class Somador1833 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
