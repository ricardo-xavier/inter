package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1456")
public class Somador1456 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
