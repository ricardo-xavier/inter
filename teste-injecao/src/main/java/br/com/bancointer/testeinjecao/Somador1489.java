package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1489")
public class Somador1489 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
