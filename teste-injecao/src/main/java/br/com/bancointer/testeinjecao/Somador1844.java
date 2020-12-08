package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1844")
public class Somador1844 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
