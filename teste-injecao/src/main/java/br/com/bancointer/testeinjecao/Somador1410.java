package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1410")
public class Somador1410 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
