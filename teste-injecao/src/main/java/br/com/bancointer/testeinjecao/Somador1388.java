package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1388")
public class Somador1388 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
