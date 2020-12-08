package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1358")
public class Somador1358 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
