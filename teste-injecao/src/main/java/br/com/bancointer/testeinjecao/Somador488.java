package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador488")
public class Somador488 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
