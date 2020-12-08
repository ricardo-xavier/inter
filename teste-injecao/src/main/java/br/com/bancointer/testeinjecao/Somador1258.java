package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1258")
public class Somador1258 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
