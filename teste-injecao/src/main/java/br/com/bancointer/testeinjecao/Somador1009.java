package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1009")
public class Somador1009 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
