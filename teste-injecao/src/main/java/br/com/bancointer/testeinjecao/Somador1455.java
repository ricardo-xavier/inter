package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1455")
public class Somador1455 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
