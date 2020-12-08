package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1274")
public class Somador1274 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
