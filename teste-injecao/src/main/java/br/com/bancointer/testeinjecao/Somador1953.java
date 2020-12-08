package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1953")
public class Somador1953 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
