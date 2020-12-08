package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1294")
public class Somador1294 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
