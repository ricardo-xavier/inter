package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1664")
public class Somador1664 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
