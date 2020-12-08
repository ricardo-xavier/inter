package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1221")
public class Somador1221 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
