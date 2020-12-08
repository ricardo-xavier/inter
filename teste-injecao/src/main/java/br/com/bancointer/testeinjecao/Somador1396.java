package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1396")
public class Somador1396 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
