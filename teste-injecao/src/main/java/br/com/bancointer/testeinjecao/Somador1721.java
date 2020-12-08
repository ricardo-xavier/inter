package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1721")
public class Somador1721 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
