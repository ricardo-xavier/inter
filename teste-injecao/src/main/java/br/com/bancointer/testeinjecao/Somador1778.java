package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1778")
public class Somador1778 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
