package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1087")
public class Somador1087 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
