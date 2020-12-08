package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1965")
public class Somador1965 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
