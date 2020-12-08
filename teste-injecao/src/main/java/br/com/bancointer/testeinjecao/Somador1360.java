package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1360")
public class Somador1360 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
