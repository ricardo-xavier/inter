package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1571")
public class Somador1571 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
