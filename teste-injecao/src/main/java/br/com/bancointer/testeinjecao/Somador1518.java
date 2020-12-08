package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1518")
public class Somador1518 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
