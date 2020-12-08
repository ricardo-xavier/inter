package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1242")
public class Somador1242 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
