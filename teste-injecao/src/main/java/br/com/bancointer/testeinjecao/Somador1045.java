package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1045")
public class Somador1045 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
