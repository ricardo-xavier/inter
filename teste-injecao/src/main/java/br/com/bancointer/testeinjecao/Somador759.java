package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador759")
public class Somador759 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
