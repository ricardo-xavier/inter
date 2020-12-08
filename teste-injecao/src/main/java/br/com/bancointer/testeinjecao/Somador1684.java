package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1684")
public class Somador1684 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
