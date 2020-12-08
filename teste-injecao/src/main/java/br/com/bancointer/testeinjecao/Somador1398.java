package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1398")
public class Somador1398 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
