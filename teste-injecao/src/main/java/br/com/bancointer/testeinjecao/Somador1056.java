package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1056")
public class Somador1056 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
