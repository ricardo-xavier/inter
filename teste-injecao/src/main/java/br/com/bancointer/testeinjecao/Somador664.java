package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador664")
public class Somador664 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
