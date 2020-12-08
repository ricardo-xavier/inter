package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1486")
public class Somador1486 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
