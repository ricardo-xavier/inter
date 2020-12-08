package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador1687")
public class Somador1687 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
