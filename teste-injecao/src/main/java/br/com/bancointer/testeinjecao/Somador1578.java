package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1578")
public class Somador1578 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
