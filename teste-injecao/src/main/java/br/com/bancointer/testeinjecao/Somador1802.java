package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1802")
public class Somador1802 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
