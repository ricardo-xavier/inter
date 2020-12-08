package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1652")
public class Somador1652 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
