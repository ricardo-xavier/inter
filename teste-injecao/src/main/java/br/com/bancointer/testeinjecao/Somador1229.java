package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1229")
public class Somador1229 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
