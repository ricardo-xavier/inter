package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1117")
public class Somador1117 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
