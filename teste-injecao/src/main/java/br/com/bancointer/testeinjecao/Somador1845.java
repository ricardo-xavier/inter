package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1845")
public class Somador1845 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
