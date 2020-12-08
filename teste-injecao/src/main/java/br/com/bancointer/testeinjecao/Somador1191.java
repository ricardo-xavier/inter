package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1191")
public class Somador1191 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
