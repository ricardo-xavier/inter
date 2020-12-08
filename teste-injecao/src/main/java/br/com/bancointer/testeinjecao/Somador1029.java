package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1029")
public class Somador1029 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
