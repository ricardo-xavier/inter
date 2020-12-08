package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1596")
public class Somador1596 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
