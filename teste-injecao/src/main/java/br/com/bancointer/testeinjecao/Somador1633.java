package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1633")
public class Somador1633 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
