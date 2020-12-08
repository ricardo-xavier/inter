package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1316")
public class Somador1316 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
