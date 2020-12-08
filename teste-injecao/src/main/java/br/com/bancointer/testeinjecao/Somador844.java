package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador844")
public class Somador844 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
