package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1136")
public class Somador1136 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
