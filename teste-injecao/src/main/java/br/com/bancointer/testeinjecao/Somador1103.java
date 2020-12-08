package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1103")
public class Somador1103 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
