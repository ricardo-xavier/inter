package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1696")
public class Somador1696 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
