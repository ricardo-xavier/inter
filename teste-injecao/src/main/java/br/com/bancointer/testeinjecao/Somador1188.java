package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1188")
public class Somador1188 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
