package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador503")
public class Somador503 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
