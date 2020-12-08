package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1154")
public class Somador1154 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
