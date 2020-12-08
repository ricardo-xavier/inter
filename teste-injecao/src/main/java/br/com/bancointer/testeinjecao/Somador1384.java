package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1384")
public class Somador1384 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
