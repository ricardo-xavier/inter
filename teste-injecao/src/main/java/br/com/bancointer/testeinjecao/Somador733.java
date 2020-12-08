package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador733")
public class Somador733 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
