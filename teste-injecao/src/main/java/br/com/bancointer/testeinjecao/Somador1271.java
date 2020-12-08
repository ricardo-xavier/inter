package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1271")
public class Somador1271 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
