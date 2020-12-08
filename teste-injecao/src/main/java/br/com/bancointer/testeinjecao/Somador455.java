package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador455")
public class Somador455 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
