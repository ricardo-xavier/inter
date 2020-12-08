package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1857")
public class Somador1857 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
