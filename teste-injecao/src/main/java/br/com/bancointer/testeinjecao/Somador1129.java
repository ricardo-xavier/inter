package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1129")
public class Somador1129 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
