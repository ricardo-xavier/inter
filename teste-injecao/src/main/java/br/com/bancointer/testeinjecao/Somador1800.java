package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1800")
public class Somador1800 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
