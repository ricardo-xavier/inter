package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1015")
public class Somador1015 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
