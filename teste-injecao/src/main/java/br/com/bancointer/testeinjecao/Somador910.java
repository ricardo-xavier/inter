package br.com.bancointer.testeinjecao;

import org.springframework.stereotype.Component;

@Component("somador910")
public class Somador910 implements Somador {
    @Override
    public int soma(int n) {
        return n + 1;
    }
}
