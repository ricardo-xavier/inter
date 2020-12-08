package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador671")
public class Somador671 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
