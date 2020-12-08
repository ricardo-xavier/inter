package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador821")
public class Somador821 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
