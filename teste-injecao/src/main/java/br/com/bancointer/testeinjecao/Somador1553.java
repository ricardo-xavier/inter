package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1553")
public class Somador1553 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
