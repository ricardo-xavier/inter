package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1985")
public class Somador1985 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
