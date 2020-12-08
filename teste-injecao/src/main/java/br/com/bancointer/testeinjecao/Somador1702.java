package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1702")
public class Somador1702 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
