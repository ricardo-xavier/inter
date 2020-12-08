package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1193")
public class Somador1193 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
