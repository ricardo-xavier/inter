package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1239")
public class Somador1239 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
