package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador944")
public class Somador944 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
