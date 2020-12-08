package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1027")
public class Somador1027 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
