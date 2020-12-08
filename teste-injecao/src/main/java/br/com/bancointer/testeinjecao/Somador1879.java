package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1879")
public class Somador1879 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
